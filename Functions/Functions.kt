package Functions

//Parameters
fun greetings (greet: String,statement: String): String {
    println("$greet $statement")
    return "Mandev"
}


fun calculate (num1: Int, num2: Int): Int {
    return num1 + num2
}



fun main () {
    greetings("Hello","Kotlin")
    println(calculate(10,5))
}