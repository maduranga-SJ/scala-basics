object Options {
  def main(args: Array[String]): Unit = {
    /**
     * Options
     * Returns some or none */

    val lst = List(1,3,4,4,5)
    val map = Map(1->"Tom",2->"Captin", 3-> "Jack")
    println(lst.find(_>6))//returns none
    println(lst.find(_>2))//returns some
    println(map.get(1))//returns some and wise versa

    //can get the actual value of a none or some function using .get
    println(lst.find(_>6).getOrElse("not found"))//returns none
    println(lst.find(_>2).getOrElse("not found"))//returns some
    println(map.get(1).getOrElse("not found"))//returns some and wise versa


    var opInt : Option[Int]= None
    println(opInt)
    opInt = Some(5)
    println(opInt.get)


  }

}
