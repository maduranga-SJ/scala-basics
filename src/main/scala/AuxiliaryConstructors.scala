
class Test(var name :String , var age :Int){
  def this(){//auxiliary constructor
    // auxilary constructors should have different signatures
    this("tom",21)//the first line of any auxilary constructor should call the default constructor with values

  }
}

object AuxiliaryConstructors {

  def main(args: Array[String]): Unit = {

  }
}
