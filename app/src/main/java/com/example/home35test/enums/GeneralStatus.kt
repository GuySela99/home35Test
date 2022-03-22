package com.example.home35test.enums

enum class GeneralStatus {
    ACTIVE,
    INACTIVE;

    companion object{
        fun fromIntToPropertyStatus(status:Int):GeneralStatus?{
            return when (status) {
                1 -> GeneralStatus.ACTIVE
                4->GeneralStatus.INACTIVE
                else->null
            }
        }
        fun fromStringToPropertyStatus(status:String):GeneralStatus?{
            return when (status) {
                "Active" -> GeneralStatus.ACTIVE
                "Inactive"->GeneralStatus.INACTIVE
                else->null

            }
        }
    }

}
