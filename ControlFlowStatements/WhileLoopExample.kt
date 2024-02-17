package ControlFlowStatements

fun main() {
    var pizzaSlices = 0
    // Start refactoring here
    while(pizzaSlices < 7) {
        println("There's only $pizzaSlices slice/s of pizza :(")
        if(pizzaSlices == 8) {
            println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
        }
        pizzaSlices++
    }

    do {
        println("There's only $pizzaSlices slice/s of pizza :(")
        if(pizzaSlices == 8) {
            println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
        }
        pizzaSlices++
    } while(pizzaSlices < 8)
}