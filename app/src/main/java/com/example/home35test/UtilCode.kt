package com.example.home35test

import com.example.home35test.enums.PropertyStatus


fun returnColorForStatus(generalStatus: String):Int {
    return when (generalStatus) {
        "ACTIVE"-> R.color.active
        "OCCUPIED"->R.color.active
        "VACANT"->R.color.vacant
        else->R.color.inactive
    }
}