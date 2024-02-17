package Collections



private fun immutableMap () {
     val maps = mapOf<Int,String>(1 to "Rugby", 2 to "Basketball", 3 to "Soccer", 4 to "Cricket")
     var arraySize= maps.size
     var first= maps.isEmpty()
     var count= maps.count()

     println("maps =>> ${maps.keys}")
    println("maps =>> ${maps.values}")
    println("maps =>> ${maps.entries}")
    maps.forEach { index, item ->  println("$index =>> $item")}
     println("arraySize =>> $arraySize")
     println("first =>> $first")
     println("count =>> $count")
 }



private fun mutableMap () {
    val maps = mutableMapOf<Int,String>(1 to "Rugby", 2 to "Basketball", 3 to "Soccer", 4 to "Cricket")
    var arraySize= maps.size
    var first= maps.isEmpty()
    var count= maps.count()

    println("maps =>> ${maps.keys}")
    println("maps =>> ${maps.values}")
    println("maps =>> ${maps.entries}")
    var putNewItem = maps.put(5,"Skating")
    var removeNewItem = maps.remove(1,)

    maps.forEach { index, item ->  println("$index =>> $item")}
    println("arraySize =>> $arraySize")
    println("first =>> $first")
    println("count =>> $count")




}



fun main () {
//    immutableMap()
    mutableMap()
}

