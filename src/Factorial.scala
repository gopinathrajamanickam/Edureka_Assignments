

object Factorial {
  def main(args: Array[String]) {
    println(fact(3))
  }
  def fact(n: Int) {
    var a = List.range(1,n+1)
    println(a)
    
    var f = a.reduceLeft(_ * _)
    println(f)
  }
}