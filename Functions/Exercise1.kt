package Functions

import kotlin.math.PI


// Exercise 1: Write a function called circleArea that takes the radius of a circle in integer format as a parameter and outputs the area of that circle.
fun circleArea(radius:Int): Double {
    // Write your code here
    return PI * radius * radius

}
fun main() {
    println(circleArea(2))
}