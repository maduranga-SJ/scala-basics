class Strict{
  val e = {
    println("Strinct")
    9
  }
}
class Lazy {
  lazy val e = {// the value is assigned only when first use
    println("Lazy")
    8
  }
}

object LazyEvaluation {
  def main(args: Array[String]): Unit = {

    val a = new Strict
    val b = new Lazy

    println(a.e)
    println(b.e)


  }
}
