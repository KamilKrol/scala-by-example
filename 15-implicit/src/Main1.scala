/**
  * Created by kamil on 12.12.15.
  */
object Main1 {

  def main(args: Array[String]): Unit = {

    val double = 1.5
    printInt(double)

  }

  implicit def doubleToInt(double: Double): Int = double.toInt

  def printInt(value: Int) = println("int = " + value)

}
