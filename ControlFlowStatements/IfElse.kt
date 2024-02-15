package ControlFlowStatements


fun shortConditional () {
    val value = true
    if (value) "Hi" else "Hello"
}

fun main () {
   val number1 = 1

    if (number1 > 5) {
        println(number1 > 5)
    } else {
        println(number1 > 5)
    }


    println(shortConditional())
}