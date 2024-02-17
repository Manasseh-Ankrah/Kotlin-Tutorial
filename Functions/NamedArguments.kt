package Functions


fun greetUser (greet:String, user:String):String {
    return "$greet $user"
}

fun greetNewUser (greet:String, user:String="Mandev"):String {
    return "$greet $user"
}
fun main () {
    println(greetUser("Hello ", "Manasseh" ))
    println(greetNewUser("Hello ", ))


}