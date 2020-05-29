object DataStructures {
  def main(args: Array[String]): Unit = {

    println("Strings -----------") //-------------------------------------
    val num = 100
    val num2 = 33.33
    val strOne: String = "Hello world "
    val strTwo: String = "Max"
    println(strOne.length)
    println(strOne.concat(strTwo))
    println("(%d---%f---%s)".format(num, num2, strOne))
    // Int / Long => decimal numbers => %d
    // Float / Double (double precision) => floatin point numbers => %f


    println("Arrays -----------") //-----------------------------------
    /**
     * Array can hold same data type elements
     * Arrays should initialize with the size
     * Arrays are mutable */

    val arr1: Array[Int] = new Array[Int](10) // or
    val arr2 = new Array[Int](5)
    arr2(0) = 10
    arr2(1) = 20
    arr2(2) = 30
    arr2(3) = 40
    arr2(4) = 100 //or
    val arr3 = Array(1, 2, 5, 40)

    for (x <- arr2) {
      println(x)
    }
    for (x <- 0 to arr3.length - 1) {
      println(arr3(x))
    }

    println("Lists -----------") //  ------------------------------------------
    /**
     * Lists are immutable
     * allows duplicates*/
    val myList = List(1, 2, 3, 4, 5)
    val myStrings: List[String] = List("one", "two", "three")
    println(myStrings)
    println(0 :: myList)
    println(1 :: 4 :: 5 :: Nil)
    println(myList)
    println(myList.head)
    println(myList.tail)
    println(myList.isEmpty)
    val rev = myList.reverse
    println(rev)
    println(List.fill(5)(0))
    myList.foreach(println)
    var sum: Int = 0
    myList.foreach(sum += _)
    println(sum)
    println("Sets --------------------------") //-------------------------------
    /**
     * sets can be mutable or immutable in scala
     * mutable set is in scala.collection.mutable.Scala
     * sets are not ordered - so cannot indexed
     * when add a new element to a set the value is added to a random place in the set
     * add new value -> mySet + 10*/

    val mySet: Set[Int] = Set(1, 4, 4, 5, 8, 10) // duplicate 4's
    val mySet2: Set[Int] = Set(800, 100, 39)
    println(mySet)
    println(mySet + 99)
    println(mySet(10))
    println(mySet.head)
    println(mySet.tail)
    println(mySet.isEmpty)
    println(mySet ++ mySet2) //concatenate
    println("Maps --------------------------") //-----------------------

    val myMap: Map[Int, String] = Map(810 -> "name", 811 -> "name2", 812 -> "name3")
    println(myMap)
    println(myMap(810))

    myMap.keys.foreach { key =>
      println("key :" + key);
      println("value :" + myMap(key))

    }

    /**
     * tuples are immutable
     * multiple types of data can be stored*/
    println("Tuple --------------------------") //-----------------------
    val myTuple = (1, "name", true, 1.009)
    val myTuple2 = new Tuple2('q', 99)
    println(myTuple)
    println(myTuple2)
    myTuple.productIterator.foreach {
      i => println(i)
    }
    println(1 -> "Tom" -> 99)
    val nestedTouple = new Tuple2(1, (11, true))
    println(nestedTouple._2._1)


  }
}
