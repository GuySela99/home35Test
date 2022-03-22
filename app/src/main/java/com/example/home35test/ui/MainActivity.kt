package com.example.home35test.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.home35test.R
import com.example.home35test.Response.PropertiesPagination
import com.example.home35test.enums.GeneralStatus
import com.example.home35test.enums.PropertyStatus
import com.example.home35test.model.Property
import com.example.home35test.viewModel.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*


class MainActivity : AppCompatActivity(),OnShowDialog {
    lateinit var adapter:PropertyAdapter
    private lateinit var viewModel: MainActivityViewModel
    var dialog:CustomDialogFragment? = null
    var createSpinnerProperty= false
    var createSpinnerTenant= false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        liveDataObservers()
        nextButton.setOnClickListener {
            viewModel.nextOrPrevPage(true)
        }
        prevButton.setOnClickListener {
            viewModel.nextOrPrevPage(false)
        }
        addAdapterToRecyclerView()
        addListenersToSpinners()
    }

    private fun addAdapterToRecyclerView() {
        recyclerViewTable.layoutManager = LinearLayoutManager(this)
        val list = viewModel.getProperties().value
        adapter = PropertyAdapter(list, this)
        recyclerViewTable.adapter = adapter
    }

    private fun liveDataObservers() {
        viewModel = ViewModelProvider(
            this,
            defaultViewModelProviderFactory
        ).get(MainActivityViewModel::class.java)
        //val mMainActivityViewModel : MainActivityViewModel by viewModels()
        viewModel.getProperties().observe(this, Observer<List<Property>> { property ->
            // update UI
            adapter.propertyListAdapter = property
            adapter.notifyDataSetChanged()
        })
        viewModel.mLoading.observe(this, Observer<Boolean> { showLoader ->
            if (showLoader) {
                loader.visibility = View.VISIBLE
            } else {
                loader.visibility = View.INVISIBLE
            }
        })
        viewModel.propertiesPage.observe(
            this,
            Observer<PropertiesPagination> { propertiesPagination ->
                pageText.text = propertiesPagination.page.toString()
                if (propertiesPagination.next!!) nextButton.visibility =
                    View.VISIBLE else nextButton.visibility = View.INVISIBLE
                if (propertiesPagination.prev!!) prevButton.visibility =
                    View.VISIBLE else prevButton.visibility = View.INVISIBLE
            })
    }

    private fun addListenersToSpinners() {
        val spinnerProperty: Spinner = findViewById(R.id.property_spinner)
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.property_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinnerProperty.adapter = adapter
        }
        spinnerProperty.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if (!createSpinnerProperty) {
                    createSpinnerProperty = true
                }
                if (viewModel.propertyStatus !=null){
                    if (viewModel.propertyStatus == PropertyStatus.fromStringToPropertyStatus(p0!!.getItemAtPosition(p2).toString())){
                        return
                    }
                }
                viewModel.filterPropertyStatus(
                    PropertyStatus.fromStringToPropertyStatus(
                        p0!!.getItemAtPosition(
                            p2
                        ).toString()
                    )
                )


            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val spinnerTenant: Spinner = findViewById(R.id.tenant_spinner)
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.tenant_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinnerTenant.adapter = adapter
        }
        spinnerTenant.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if (!createSpinnerTenant) {
                    createSpinnerTenant = true
                    return
                }
                if (viewModel.tenantStatus  !=null){
                    if (viewModel.tenantStatus == GeneralStatus.fromStringToPropertyStatus(p0!!.getItemAtPosition(p2).toString())){
                        return
                    }
                }
                    viewModel.filterTenantStatus(
                        GeneralStatus.fromStringToPropertyStatus(
                            p0!!.getItemAtPosition(
                                p2
                            ).toString()
                        )
                    )
                
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }



    override fun showDialog(propertyName: String, status: String) {
        dialog= CustomDialogFragment()
        dialog!!.show(this.supportFragmentManager ,null)
        dialog!!.changeValues(propertyName,status)

    }



    override fun onPause() {
        super.onPause()
        if (dialog != null){
            supportFragmentManager.findFragmentById(dialog!!.id)?.onDestroy()
        }
    }
}
