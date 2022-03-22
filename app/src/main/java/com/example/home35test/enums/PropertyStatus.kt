package com.example.home35test.enums

enum class PropertyStatus {
    ACTIVE,
    OCCUPIED,
    VACANT,
    INACTIVE;

    companion object{
        fun fromIntToPropertyStatus(status:Int):PropertyStatus?{
            return when (status) {
                1 -> PropertyStatus.ACTIVE
                2 -> PropertyStatus.OCCUPIED
                3 -> PropertyStatus.VACANT
                4->PropertyStatus.INACTIVE
                else->null
            }
        }
        fun fromStringToPropertyStatus(status:String):PropertyStatus?{
            return when (status) {
                "Active" -> PropertyStatus.ACTIVE
                "Occupied" -> PropertyStatus.OCCUPIED
                "Vacant" -> PropertyStatus.VACANT
                "Inactive"->PropertyStatus.INACTIVE
                else->null

            }
        }
    }

}
