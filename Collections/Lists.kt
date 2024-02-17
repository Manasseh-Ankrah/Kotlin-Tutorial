package Collections



private fun immutableList () {
     val lists = listOf<String>("Rugby","Basketball","Soccer","Cricket")
     var arraySize= lists.size
     var first= lists.get(0)
     var last= lists.get(lists.size - 1)
     var setnew= lists.lastIndexOf("Cricket")


     println("Lists =>> $lists")
     println("arraySize =>> $arraySize")
     println("first =>> $first")
     println("last =>> $last")
     println("setnew =>> $setnew")
 }



private fun mutableList () {
    val lists = mutableListOf<String>("Rugby","Basketball","Soccer","Cricket")
    var arraySize= lists.size
    var first= lists.get(0)
    var last= lists.get(lists.size - 1)
    var setnew= lists.lastIndexOf("Cricket")

    println("Lists =>> $lists")
    println("arraySize =>> $arraySize")
    println("first =>> $first")
    println("last =>> $last")
    println("setnew =>> $setnew")
    lists.add("Football")
    println("Lists =>> $lists")
    lists.remove("Football")
    lists.removeAt(0)

    println("Lists =>> $lists")


}



fun main () {
//    immutableList()
    mutableList()
}

