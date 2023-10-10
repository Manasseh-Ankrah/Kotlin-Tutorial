val name:String = "Manasseh";
fun main() {
    println("Welcome to Variables")
    immutableVariable()
    mutableVariable()
}


//read-only variables with val
fun immutableVariable() {
    val num1 = 10;
    val num2 = 5;
    println(num1 + num2)
    println("Name in immutableVariable $name")

}

//mutable variables with var
fun mutableVariable() {
    var num3 = 30;
    num3 = 10;
    println(num3)
    println("Name in mutableVariable $name")
}

