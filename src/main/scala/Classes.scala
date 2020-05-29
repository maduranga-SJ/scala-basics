//scala - classes - constructors - types
/**
 *            Getter     Setter
 *-------     ------     -------
 * var        Yes         Yes
 * val        Yes         No
 * default    no          no
 * */

class User //class declared with only the class name

class Person(x:Int, name:String)//class declared with constructor

class Body(z:Int,a:String){//Class with a constructor an functions
  def printName(){println(a)}
}
class BodyNew(val z:Int,val a:String){}

class Lol(var/*var i used instead of val*/ z:Int,val a:String){}

object Classes {
  def main(args: Array[String]): Unit = {
    val usr = new User;
    val prsn = new Person(9,"name is khan !")
    println(prsn)

    val bd = new Body(8,"lol this is a object of Body")
    bd.printName()
   // println(bd.z) will not work. no val z is created inside the function
    //solution
    val bdn = new BodyNew(8,"lol this is a object of Body")
    println(bdn.z)// getter works
    //bdn.z = 66; cannot re assign as val is passed to the function
    //solution
    val bdlol = new Lol(8,"lol this is a object of Body")
    println(bdlol.z)
    bdlol.z= 100
    println(bdlol.z)

  }
}