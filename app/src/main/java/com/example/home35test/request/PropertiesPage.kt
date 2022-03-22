package com.example.home35test.request

import com.example.home35test.enums.GeneralStatus
import com.example.home35test.enums.PropertyStatus

data class PropertiesPage(var page:Int, val currentPosition:Int, val propertyStatus:PropertyStatus?, val tenantStatus:GeneralStatus?, val next:Boolean?,val prev:Boolean?)