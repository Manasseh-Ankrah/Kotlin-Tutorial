package Functions
import kotlin.math.PI


//Re-writing Exercise 1 using single-expression function.
fun newCircleArea (radius:Int) = PI * radius * radius


fun main () {
    println(newCircleArea(2))
}