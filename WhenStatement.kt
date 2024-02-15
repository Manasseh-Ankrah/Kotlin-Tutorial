fun main() {

    val greetings: String = "Evening"

    when(greetings) {
        "Morning" -> println("Good Morning Manasseh")
        "Afternoon" -> println("Good Afternoon Manasseh")
        "Evening" -> println("Good Evening Manasseh")
        else -> println("No greetings received")
    }
}