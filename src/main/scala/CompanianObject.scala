class CompanianObject(name:String,age:Int ) {

  def getName(): String ={
    this.name
  }
}

// create companian object so that an object of 'Companian object ' can be created without the new key word
object CompanianObject{
  def apply(name: String, age: Int): CompanianObject = new CompanianObject(name, age)
}

// if it is a case class also we no need to use new keyword for initializing

case class A(a:Int){

}

object MainClass{
  def main(args: Array[String]): Unit = {
    val a :A = A(99)

  }
}
