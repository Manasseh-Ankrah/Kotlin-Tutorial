package Collections



private fun immutableSets () {
     val sets = setOf<String>("Rugby","Basketball","Soccer","Cricket")
     var arraySize= sets.size
     var first= sets.isEmpty()
     var count= sets.count()
     var setnew= sets.lastIndexOf("Cricket")

     println("Lists =>> $sets")
     println("arraySize =>> $arraySize")
     println("first =>> $first")
     println("count =>> $count")
     println("setnew =>> $setnew")
 }



private fun mutableSets () {
    val sets = mutableSetOf<String>("Rugby","Basketball","Soccer","Cricket")
    var arraySize= sets.size
    var first= sets.isEmpty()
    var count= sets.count()
    var setnew= sets.lastIndexOf("Cricket")


    println("Lists =>> $sets")
    sets.add("Wrestling")
    println("arraySize =>> $arraySize")
    println("first =>> $first")
    println("count =>> $count")
    println("setnew =>> $setnew")
    println("Lists =>> $sets")


}



fun main () {
//    immutableSets()
    mutableSets()
}

