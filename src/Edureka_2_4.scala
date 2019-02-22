

object Edureka_2_4 {
  def main(args: Array[String]) {
    var arrayToTest = Array(3,2,43,231,232,433,33)
    
    println(" Maximum element in this array is :" + arrayToTest.reduceLeft(_ max _))   
  }
}