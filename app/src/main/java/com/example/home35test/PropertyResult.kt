package com.example.home35test

import com.example.home35test.enums.GeneralStatus
import com.example.home35test.enums.PropertyStatus
import com.example.home35test.model.Property

object PropertyResult {
    const val RESULT_PAGE=30
    val properties = listOf<Property>(
        Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
                "8091233\n" +
                "Orlando,\n" +
                "FL\n" +
                "1234-56789\n" +
                "United States",PropertyStatus.OCCUPIED,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
                "8091233\n" +
                "Orlando,\n" +
                "FL\n" +
                "1234-56789\n" +
                "United States",PropertyStatus.VACANT,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
                "8091233\n" +
                "Orlando,\n" +
                "FL\n" +
                "1234-56789\n" +
                "United States",PropertyStatus.ACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.INACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
                "8091233\n" +
                "Orlando,\n" +
                "FL\n" +
                "1234-56789\n" +
                "United States",PropertyStatus.INACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.INACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
                "8091233\n" +
                "Orlando,\n" +
                "FL\n" +
                "1234-56789\n" +
                "United States",PropertyStatus.OCCUPIED,"On-Demand","The Residentail Coroption",GeneralStatus.INACTIVE,"Sagre stutzman 8", GeneralStatus.INACTIVE)
        ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
                "8091233\n" +
                "Orlando,\n" +
                "FL\n" +
                "1234-56789\n" +
                "United States",PropertyStatus.VACANT,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
        ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
                "8091233\n" +
                "Orlando,\n" +
                "FL\n" +
                "1234-56789\n" +
                "United States",PropertyStatus.ACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.INACTIVE)
        ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
                "8091233\n" +
                "Orlando,\n" +
                "FL\n" +
                "1234-56789\n" +
                "United States",PropertyStatus.INACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.INACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,        Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.OCCUPIED,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.VACANT,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.ACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.INACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.INACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.INACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.OCCUPIED,"On-Demand","The Residentail Coroption",GeneralStatus.INACTIVE,"Sagre stutzman 8", GeneralStatus.INACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.VACANT,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.ACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.INACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.INACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.INACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,        Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.OCCUPIED,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.VACANT,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.ACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.INACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.INACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.INACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.OCCUPIED,"On-Demand","The Residentail Coroption",GeneralStatus.INACTIVE,"Sagre stutzman 8", GeneralStatus.INACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.VACANT,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.ACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.INACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.INACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.INACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,        Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.OCCUPIED,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.VACANT,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.ACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.INACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.INACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.INACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.OCCUPIED,"On-Demand","The Residentail Coroption",GeneralStatus.INACTIVE,"Sagre stutzman 8", GeneralStatus.INACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.VACANT,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.ACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.INACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.INACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.INACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE),
    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.OCCUPIED,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.VACANT,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.ACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.INACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.INACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.INACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.OCCUPIED,"On-Demand","The Residentail Coroption",GeneralStatus.INACTIVE,"Sagre stutzman 8", GeneralStatus.INACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.VACANT,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.ACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.INACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.INACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.INACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE),
    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.OCCUPIED,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.VACANT,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.ACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.INACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.INACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.INACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.OCCUPIED,"On-Demand","The Residentail Coroption",GeneralStatus.INACTIVE,"Sagre stutzman 8", GeneralStatus.INACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.VACANT,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.ACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.INACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.INACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.INACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE),
    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.OCCUPIED,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.VACANT,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.ACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.INACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.INACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.INACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.OCCUPIED,"On-Demand","The Residentail Coroption",GeneralStatus.INACTIVE,"Sagre stutzman 8", GeneralStatus.INACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.VACANT,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.ACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.ACTIVE,"Sagre stutzman 8", GeneralStatus.INACTIVE)
    ,    Property("8/15/21","122222 NE Ivanhoe Blvd\n" +
    "8091233\n" +
    "Orlando,\n" +
    "FL\n" +
    "1234-56789\n" +
    "United States",PropertyStatus.INACTIVE,"On-Demand","The Residentail Coroption",GeneralStatus.INACTIVE,"Sagre stutzman 8", GeneralStatus.ACTIVE))

}