package com.example.home35test.api

import android.util.Log
import com.example.home35test.PropertyResult
import com.example.home35test.PropertyResult.RESULT_PAGE
import com.example.home35test.Response.PropertiesPagination
import com.example.home35test.model.Property
import com.example.home35test.request.PropertiesPage
import okhttp3.OkHttpClient
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import kotlin.math.roundToInt

interface PropertyServiceApi {
    @GET("properties")
    fun getAllProperties() : Call<List<Property>>

    @POST("properties")
    fun getPropertiesWithPagination(@Body propertiesPage: PropertiesPage) : Call<PropertiesPagination>

    companion object {
        var retrofitService: PropertyServiceApi? = null

        fun getInstance() : PropertyServiceApi {
            if (retrofitService == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl("http://www.demoApi.com/fake/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(OkHttpClient.Builder().build())
                    .build()
                retrofitService = retrofit.create(PropertyServiceApi::class.java)
            }
            return retrofitService!!
        }

        fun getAllProperties(propertiesPage: PropertiesPage):PropertiesPagination{
            getInstance().getPropertiesWithPagination(propertiesPage).enqueue(object : Callback<PropertiesPagination> {
                override fun onResponse(
                    call: Call<PropertiesPagination>,
                    response: Response<PropertiesPagination>
                ) {
                    Log.d("PropertyServiceApi","call success")
                }

                override fun onFailure(call: Call<PropertiesPagination>, t: Throwable) {
                    Log.d("PropertyServiceApi","call failed")
                }

            })
            return FakeCall(propertiesPage)
        }

        private fun FakeCall(propertiesPage: PropertiesPage): PropertiesPagination {
            //each page have 30 result at max

            var fakeDBArrayOfProperty= PropertyResult.properties
            //filter the fakeDBArrayOfProperty
            fakeDBArrayOfProperty=fakeDBArrayOfProperty.filter {
                if (propertiesPage.tenantStatus == null){
                    true
                }else it.tenantStatus == propertiesPage.tenantStatus

            }
            fakeDBArrayOfProperty=fakeDBArrayOfProperty.filter {
                if (propertiesPage.propertyStatus == null){
                    true
                }else it.propertyStatus == propertiesPage.propertyStatus
            }

            var page = propertiesPage.page
            var nextPage=propertiesPage.next
            var prevPage= propertiesPage.prev
            var propertiesPageResult = PropertiesPagination(mutableListOf(),0,0,0,null,null)
            if (page==0) prevPage=false

            //condition where to move with pagination
            if (propertiesPage.next!=null && propertiesPage.prev!=null) {
                //request move forward
                if (propertiesPage.next){
                    page += 1
                    propertiesPageResult= propertiesPaginationNextReturnResult(propertiesPage, page, fakeDBArrayOfProperty, nextPage, prevPage)
                }else if (propertiesPage.prev) {
                    //request move backward
                    page -= 1
                    propertiesPageResult= propertiesPaginationPrevReturnResult(propertiesPage, page, fakeDBArrayOfProperty, nextPage, prevPage)
                }
            }else{
                //request new filter
                page=1
                propertiesPageResult= propertiesPaginationFilterReturnResult(propertiesPage, page, fakeDBArrayOfProperty )
            }


            return propertiesPageResult

        }

        /**
         * pagination filter
         */
        private fun propertiesPaginationFilterReturnResult(
            propertiesPage: PropertiesPage,
            page: Int,
            fakeDBArrayOfProperty: List<Property>,
        ): PropertiesPagination {
            var startIndex =propertiesPage.currentPosition
            var lastIndex = page *RESULT_PAGE
            var nextPage1 = page != ((fakeDBArrayOfProperty.size.toDouble() / RESULT_PAGE.toDouble()).roundToInt()) && fakeDBArrayOfProperty.size>RESULT_PAGE
            var prevPage1 = page != 1
            val diff = fakeDBArrayOfProperty.size - startIndex

            if (diff <= 0) {
                // not have data
                nextPage1 = false
                return PropertiesPagination(mutableListOf(), 0, fakeDBArrayOfProperty.size, page, nextPage1, prevPage1)
            }
            if (diff <= RESULT_PAGE && startIndex < fakeDBArrayOfProperty.size) {
                //end of pagination but have less the RESULT_PAGE result
                //nextPage1 = false
                val subList = fakeDBArrayOfProperty.subList(startIndex, startIndex + diff)
                return PropertiesPagination(subList, subList.size+propertiesPage.currentPosition, fakeDBArrayOfProperty.size, page, nextPage1, prevPage1)
            }

            //continue withPagination with RESULT_PAGE each time
            val subList = fakeDBArrayOfProperty.subList(startIndex, lastIndex)
            return PropertiesPagination(subList, subList.size+propertiesPage.currentPosition, fakeDBArrayOfProperty.size, page, nextPage1, prevPage1)
        }

        /**
         * pagination Next page
         */
        private fun propertiesPaginationNextReturnResult(
            propertiesPage: PropertiesPage,
            page: Int,
            fakeDBArrayOfProperty: List<Property>,
            nextPage: Boolean?,
            prevPage: Boolean?
        ): PropertiesPagination {
            var startIndex =propertiesPage.currentPosition
            var lastIndex = page *RESULT_PAGE
            var nextPage1 = page != ((fakeDBArrayOfProperty.size.toDouble() / RESULT_PAGE.toDouble()).roundToInt())
            var prevPage1 = page != 1
            val diff = fakeDBArrayOfProperty.size - startIndex
            if (diff <= 0) {
                // not have data
                nextPage1 = false
                return PropertiesPagination(mutableListOf(), 0, fakeDBArrayOfProperty.size, page, nextPage1, prevPage1)
            }
            if (diff <= RESULT_PAGE && startIndex < fakeDBArrayOfProperty.size) {
                //end of pagination but have less the RESULT_PAGE result
                //nextPage1 = false
                val subList = fakeDBArrayOfProperty.subList(startIndex, startIndex + diff)
                return PropertiesPagination(subList, subList.size+propertiesPage.currentPosition, fakeDBArrayOfProperty.size, page, nextPage1, prevPage1)
            }

            //continue withPagination with RESULT_PAGE each time
            val subList = fakeDBArrayOfProperty.subList(startIndex, lastIndex)
            return PropertiesPagination(subList, subList.size+propertiesPage.currentPosition, fakeDBArrayOfProperty.size, page, nextPage1, prevPage1)
        }

        /**
         * pagination prev page
         */
        private fun propertiesPaginationPrevReturnResult(
            propertiesPage: PropertiesPage,
            page: Int,
            fakeDBArrayOfProperty: List<Property>,
            nextPage: Boolean?,
            prevPage: Boolean?
        ): PropertiesPagination {
            var lastIndex=propertiesPage.currentPosition
            var startIndex = page *RESULT_PAGE
            var nextPage1 = page != ((fakeDBArrayOfProperty.size.toDouble() / RESULT_PAGE.toDouble()).roundToInt())
            var prevPage1 = page != 1
            val deltaBetweenPages = RESULT_PAGE -startIndex
            if (deltaBetweenPages != 0 && startIndex > 0) {
                nextPage1 = true
                val subList = fakeDBArrayOfProperty.subList(startIndex,lastIndex-deltaBetweenPages)
                return PropertiesPagination(subList, subList.size+propertiesPage.currentPosition, fakeDBArrayOfProperty.size, page, nextPage1, prevPage1)
            }
            if (deltaBetweenPages < 0) {
                // not have data
                nextPage1 = false
                return PropertiesPagination(mutableListOf(), 0, fakeDBArrayOfProperty.size, page, nextPage1, prevPage)
            }


            //continue withPagination with RESULT_PAGE each time
            val subList = fakeDBArrayOfProperty.subList(startIndex, lastIndex)
            return PropertiesPagination(subList, propertiesPage.currentPosition-subList.size, fakeDBArrayOfProperty.size, if(page==0)1 else page , nextPage1, prevPage1)
        }
    }
}