object CallByName {
  private val pi = 3.14

  def getPy(): Double ={
    println("I''m inside the function getPy")
    this.pi
  }

  def callByValue(d:Double): Unit ={
    println("inn call by val function")
    println(d)
  }
  def callByNameDemo(d: => Double): Unit ={
    println("inn call by name function")
    println(d)
  }

  def main(args: Array[String]): Unit = {
    callByValue(getPy())
    println("---------------------------------")
    callByNameDemo(getPy())
  }

}
