

class CompanionObject {
  Test.instanceCount += 1
}

object Test {
  var instanceCount: Int = 0
  
  def printInstanceCount(): Unit = {
    println("Current instance count is :" + instanceCount)
  }
}

object Main {
  def main(args:  Array[String]): Unit = {
    for (i <- 1 to 20)
      new CompanionObject()
    
    Test.printInstanceCount()
  }
}
