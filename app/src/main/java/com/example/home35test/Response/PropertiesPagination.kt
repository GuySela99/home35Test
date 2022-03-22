package com.example.home35test.Response

import com.example.home35test.model.Property

data class PropertiesPagination(val properties:List<Property>,
                                var count:Int,
                                val sumResult:Int,
                                var page:Int,
                                val next:Boolean?,
                                val prev:Boolean?)