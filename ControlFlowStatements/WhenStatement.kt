package ControlFlowStatements

fun AccessChecker ( ) {
    val allowedAge = 25
    val personType:String;

    personType = when (allowedAge) {
         10 -> "Child Identified"
         13 -> "Adolescent Identified"
         25 -> "Adult Identified"
        else -> "Unknown Person Type"
    }

    println(personType)
}


fun StatusChecker ( ) {
    val age = 17
    val comment:String;

    comment = when {
        age < 18 -> "Not Legal"
        age >= 18 -> "Legal"
        else -> "Unknown Status"
    }

    println(comment)
}





fun main() {
    val greetings: String = "Evening"

    when(greetings) {
        "Morning" -> println("Good Morning Manasseh")
        "Afternoon" -> println("Good Afternoon Manasseh")
        "Evening" -> println("Good Evening Manasseh")
        else -> println("No greetings received")
    }


//    AccessChecker()
    StatusChecker()
}