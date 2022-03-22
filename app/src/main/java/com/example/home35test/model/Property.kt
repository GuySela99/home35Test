package com.example.home35test.model

import com.example.home35test.R
import com.example.home35test.enums.GeneralStatus
import com.example.home35test.enums.PropertyStatus

data class Property(
    val created:String,
    val propertyAddress: String,
    val propertyStatus: PropertyStatus,
    val plan: String,
    val owner: String,
    val ownerStatus: GeneralStatus,
    val tenant: String,
    val tenantStatus: GeneralStatus,
){
    fun returnPropertyStatusColor(propertyStatus: PropertyStatus):Int{
        return when (propertyStatus) {
            PropertyStatus.ACTIVE-> R.color.active
            PropertyStatus.OCCUPIED->R.color.active
            PropertyStatus.VACANT->R.color.vacant
            else->R.color.inactive

        }
    }

    fun returnStatusColor(generalStatus: GeneralStatus):Int {
        if (GeneralStatus.ACTIVE==generalStatus) {
            return R.color.active
        }
        return R.color.inactive
    }

}
