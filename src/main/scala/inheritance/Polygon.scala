package inheritance

class Polygon{
  def area:Double = 0.0
}

object Polygon{
  def main(args: Array[String]): Unit = {
    var polygon = new Polygon;
    var rectangle = new Rectangle(10,10)// if the method in child class is missing, then super class method will be called
    // But it is a problem so should declare them as abstract
    printArea(polygon)

  }
  def printArea(p:Polygon): Unit ={
    print(p.area)
  }
}
