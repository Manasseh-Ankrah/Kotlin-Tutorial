package ControlFlowStatements


fun main () {
    for (number in 1..100){
         if (number % 3 == 0 && number % 5 == 0) {
            println("Fizz Buzz")
        }
        else if (number % 3 == 0) {
            println("Fizz")
        } else if (number % 5 == 0) {
            println("Buzz")
        }
        else {
            println(number)
        }
    }
}