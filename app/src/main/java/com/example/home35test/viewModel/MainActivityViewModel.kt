package com.example.home35test.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.home35test.PropertyResult
import com.example.home35test.Response.PropertiesPagination
import com.example.home35test.api.PropertyServiceApi
import com.example.home35test.enums.GeneralStatus
import com.example.home35test.enums.PropertyStatus
import com.example.home35test.model.Property
import com.example.home35test.request.PropertiesPage
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivityViewModel():ViewModel() {

     val mProperties: MutableLiveData<List<Property>> = MutableLiveData()
     var mLoading:MutableLiveData<Boolean> = MutableLiveData()
     var propertiesPage: MutableLiveData<PropertiesPagination> = MutableLiveData()
     var propertyStatus:PropertyStatus? = null
     var tenantStatus:GeneralStatus? = null

    init {
        loadProperties()
    }
    fun getProperties(): LiveData<List<Property>> {
        return mProperties
    }


     private fun loadProperties() {
         mLoading.postValue(true)
         viewModelScope.launch {
             delay(2000)
             propertiesPage.value=PropertyServiceApi.getAllProperties(PropertiesPage(0,0,null,null,true,false))
             mProperties.postValue(propertiesPage.value?.properties)
             mLoading.postValue(false)
         }

    }

    fun filterPropertyStatus(propertyStatusParam: PropertyStatus?){
        val tempPropertiesPage = propertiesPage.value
        if (propertyStatus != propertyStatusParam){
            tempPropertiesPage?.page =0
            tempPropertiesPage?.count =0
        }
        propertyStatus= propertyStatusParam
        mLoading.postValue(true)
        viewModelScope.launch {
            delay(1000)
            if (tenantStatus == null){
                propertiesPage.value=PropertyServiceApi.getAllProperties(PropertiesPage(tempPropertiesPage!!.page,tempPropertiesPage.count,propertyStatus,null,null,null))
            }else{
                propertiesPage.value=PropertyServiceApi.getAllProperties(PropertiesPage(tempPropertiesPage!!.page,tempPropertiesPage.count,propertyStatus,tenantStatus,null,null))
            }

            mProperties.postValue(propertiesPage.value?.properties)
            mLoading.postValue(false)
        }
    }
    fun filterTenantStatus(tenantStatusParam: GeneralStatus?){
        val tempPropertiesPage = propertiesPage.value
        if (tenantStatus != tenantStatusParam){
            tempPropertiesPage?.page =0
            tempPropertiesPage?.count =0
        }
        tenantStatus = tenantStatusParam
        mLoading.postValue(true)
        viewModelScope.launch {
            delay(1000)
            if (propertyStatus == null){
                propertiesPage.value=PropertyServiceApi.getAllProperties(PropertiesPage(tempPropertiesPage!!.page,tempPropertiesPage.count,null,tenantStatus,null,null))
            }else{
                propertiesPage.value=PropertyServiceApi.getAllProperties(PropertiesPage(tempPropertiesPage!!.page,tempPropertiesPage.count,propertyStatus,tenantStatus,null,null))
            }

            mProperties.postValue(propertiesPage.value?.properties)
            mLoading.postValue(false)
        }
    }

    fun nextOrPrevPage(next:Boolean){
        val tempPropertiesPage = propertiesPage.value
        mLoading.postValue(true)
        viewModelScope.launch {
            delay(1000)
            if (next){
                propertiesPage.value = PropertyServiceApi.getAllProperties(PropertiesPage(tempPropertiesPage!!.page,tempPropertiesPage.count,propertyStatus,tenantStatus,true,false))
            }else{
                propertiesPage.value = PropertyServiceApi.getAllProperties(PropertiesPage(tempPropertiesPage!!.page,tempPropertiesPage.count,propertyStatus,tenantStatus,false,true))
            }

            mProperties.postValue(propertiesPage.value?.properties)
            mLoading.postValue(false)
        }
    }

}