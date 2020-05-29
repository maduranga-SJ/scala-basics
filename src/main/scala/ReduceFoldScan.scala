object ReduceFoldScan {

  val lst1 = List(1,5,9,10)
  val lst2 = List("A","B","C")

  def main(args: Array[String]): Unit = {


    //Reduce left / Right
    println(lst1.reduceLeft(_+_))
    println(lst2.reduceRight(_+_))
    println(lst2.reduceRight((x,y)=>{println(x+","+ y);x+y}))

    //fold left/right
    println(lst1.foldLeft(0)(_+_))//should give an initial value
    println(lst2.foldRight("lol :D I am a scala developer now !!! ")(_+_))

    //scan left / right
    println(lst1.scanLeft(0)(_+_))
    println(lst2.scanRight("a,sdfjs98f")(_+_))

  }

}
