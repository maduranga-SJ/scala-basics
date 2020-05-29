object Functions {
  //Basic Functions
  def basicFunction(x: Int, y: Int): Int={x + y}
  //Anonymous Functions
  val x = (x: Int, z: Int) => x + z
  def anonymousFunction(): Int = {val k = (x: Int, z: Int) => x * z;k(10,9)}
  //Higher Order Functions
  def higherOrder(x:Int,y:Int,f:(Int,Int)=>Int): Int =f(x,y)
  //Partially applied functions
  /*no defference in implementation of the function ..only the usage differs*/
  //closures
  var number = 1000
  var closureFunction = (x:Int)=> x+ number
  //Currying Functions
  def curryigFunction(x:Int)=(y:Int)=>x+y


  def main(args: Array[String]): Unit = {
    println("Sala Functions \n---------------\n")

    //basic function
    println(basicFunction(10,5))
    println(x(100,50))
    println(anonymousFunction())
    println(higherOrder(10,9,(x,z)=>x min z))
    //partial applied functions
    val add = basicFunction(90,_:Int)
    println(add(100))
    //closures
    number = 90
    println(closureFunction(10))
    //currying
    val cur = curryigFunction(20)
    println(cur(100))
    println(curryigFunction(100)(50))

  }


}
