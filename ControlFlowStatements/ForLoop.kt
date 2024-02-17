package ControlFlowStatements

fun main () {

    var groceries = listOf<String>("Vegetables","Snacks","Protein")
    for (number in 1..10) {
        println(number)
    }

    for (groc in groceries) {
        println(groc)
    }

    for (alpha in 'A'..'Z') {
        println(alpha)
    }

    for (number in 10 downTo  1) {
        println(number)
    }
}