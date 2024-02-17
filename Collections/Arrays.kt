package Collections

fun main () {
    var arr = arrayListOf<String>("Java","Kotlin","PHP")
    var arraySize= arr.size
    var first= arr.get(0)
    var last= arr.get(arr.size - 1)
    var setnew= arr.set(0,"JS")



    println("Array Values =>> $arr")
    println("Array Size/Length =>> $arraySize")
    println("Array first value =>> $first")
    println("Array LAST value =>> $last")
    println("Array setnew value =>> $setnew")

   // Looping through array
//    for (lang in arr) {
//        println("Array Single value =>> $lang")
//    }

   // Normal fir loop
//
//    for (val lang = 0; lang < arr.size; lang++ ){
//        println("Array Single value =>> $lang")
//    }



}