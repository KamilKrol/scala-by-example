/**
  * Created by kamil on 06.12.15.
  */
object Main1 {

  def main(args: Array[String]): Unit = {

    val complex1 = new Complex(1.0, 2.0)
    val complex2 = new Complex(2.0, -1.5)

    println("complex1: " + complex1 + " complex2: " + complex2)

    val result = complex1 + complex2
    println("result: " + result)

  }

}
