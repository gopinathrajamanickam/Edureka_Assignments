/*
 * Write an object Conversions with methods inchestoFeet, milestoKms and poundsToKilos
 * and invoke its methods from a class of your choice
 */



class Module_2_2 {
      Conversions.inchestoFeet(20) 
      Conversions.milestoKms(10)
      Conversions.poundsToKilos(130)
}

object Conversions {
    def inchestoFeet(inches: Double): Unit = {
      var feet: Double = inches/12 
      println(inches + "in Feet is " + feet)
    }
    def milestoKms(miles: Double): Unit = {
      var kms: Double =miles/1.609
      println(miles + "in Kms is " + kms)
    }
    def poundsToKilos(pounds: Double): Unit = {
      var kilos: Double =pounds/2.205
      println(pounds + "in kilos is " + kilos)
    }
}

object ConversionTest {
  def main(args: Array[String]): Unit = {
      var solution =  new Module_2_2()
  }
}