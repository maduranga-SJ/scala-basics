object Loops {
  def main(args: Array[String]): Unit = {
    val nums = Seq(1,2,3)
    val  doubleNums = for(n <- nums )yield n*2
    print(doubleNums)
  }
}
