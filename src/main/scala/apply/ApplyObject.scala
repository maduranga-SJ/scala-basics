package apply

import javax.security.auth.login.{AppConfigurationEntry, Configuration}

case class Person(name: String, age: Integer, favColor: String)

object ApplyObject {
  /**
   *
   * apply methods give you a nice syntactic sugar for when a class or object has one main use.
   *
   *
   */
  def apply(name: String): String = {
    "Hello %s".format(name)
  }

}

abstract class DatabaseDriver {
  // some database stuff
}

object DatabaseDriver {
  def apply(config: Configuration) = config match {
    case "MYSQL" =>
    case "PSQL" =>
    case _ =>
  }
}

/**
 * anonymous functions also works as apply function
 *
 * anonymousFunction.apply()
 * equals to
 * anonymousFunction()
 */

//Bonus - Put an apply function in a class (not an object!)

class Amazing {
  def apply(x: String) = "Amazing %s!".format(x)
}



object ApplyMain{
  def main(args: Array[String]): Unit = {

    println(ApplyObject("mical "))
    println(ApplyObject.apply("mical _apply"))

    // The following three all do the same thing. Typically most developers use the first version

    val p0 = new Person("Frank", 23, "Blue") // normal constructor
    val p1 = Person("Frank", 23, "Blue") // this uses apply
    val p2 = Person.apply("Frank", 23, "Blue") // using apply manually

    //----------------------------------------

    val dbConfig = new Configuration {
      override def getAppConfigurationEntry(name: String): Array[AppConfigurationEntry] = ???
    }
    val mydatabase = DatabaseDriver(dbConfig)
    //----------------------------------------------
    val amazing = new Amazing()
    amazing("world")

  }
}
