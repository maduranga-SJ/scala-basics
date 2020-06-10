object Functions {
  //Basic Functions
  def basicFunction(x: Int, y: Int): Int = {
    x + y
  }

  //Anonymous Functions
  val x = (x: Int, z: Int) => x + z

  def anonymousFunction(): Int = {
    val k = (x: Int, z: Int) => x * z; k(10, 9)
  }

  //Higher Order Functions
  def higherOrder(x: Int, y: Int, f: (Int, Int) => Int): Int = f(x, y)

  /*above HO function takes a function as a parameter*/
  def higherOrderReturn(data: String): String => String = {
    _: String => s"$data"
  }

  /*above HO function returns a function as the return value*/
  //Partially applied functions
  /*no defference in implementation of the function ..only the usage differs*/
  //closures
  var number = 1000 //this value can be changed as it is declared as var wich affect the PURE nature of that function
  //If we declared "number " as a val variable then the closure is a pure one
  var closureFunction = (x: Int) => x + number

  //Currying Functions
  def curryigFunction(x: Int) = (y: Int) => x + y

  //polymorphic function
  def listOfDuplicates[A](x: A, length: Int): List[A] = {
    if (length < 1)
      Nil
    else
      x :: listOfDuplicates(x, length - 1)
  }

  def main(args: Array[String]): Unit = {
    println("Sala Functions \n---------------\n")

    //basic function
    println(basicFunction(10, 5))
    println(x(100, 50))
    println(anonymousFunction())
    // higher order function takes a function as a input
    println(higherOrder(10, 9, (x, z) => x min z))
    // higher order function that returns a function
    val foo = higherOrderReturn("ho - return")
    println(foo("kjloisjadf;ois"))
    //partial applied functions
    val add = basicFunction(90, _: Int)
    println(add(100))
    //closures
    number = 90
    println(closureFunction(10))
    //currying
    val cur = curryigFunction(20)
    println(cur(100))
    println(curryigFunction(100)(50))

    //polymorphic function
    println(listOfDuplicates[Int](3, 4)) // List(3, 3, 3, 3)
    println(listOfDuplicates("La", 8)) // List(La, La, La, La, La, La, La, La)

  }


}
