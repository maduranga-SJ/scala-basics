object MapNFilter {
  val lst = List(1,3,4,4,5)
  val myMap = Map(1->"Tom",2->"Captain", 3-> "Jack")
  def main(args: Array[String]): Unit = {
    println(lst.map(_*2))
    //or more specific
    println(lst.map(x=>x*3 + 2))

    //for maps little messy
    println(myMap.view.mapValues(x=>x+" hi").toMap)// updated version of map Values

    //upper case
    println("hello".map(_.toUpper))

    //flatten
    println(List(List(1,2),List("lol",true)).flatten)

  //flatmap
    println(lst.flatMap(x=>List(x,x+ " XXX")))
    println(lst.map(x=>List(x,x+ " XXX")))

    //filter
    println(lst.filter(x=>x%2!=0/*give a condition here */))
  }
}
