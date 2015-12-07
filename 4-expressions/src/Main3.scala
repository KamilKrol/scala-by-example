/**
  * Created by kamil on 07.12.15.
  */
object Main3 {

  def main(args: Array[String]): Unit = {

    for (value <- 1 to 9)
      println("sqrt(" + value + ") = " + sqrt(value))

  }

  def sqrt(x: Double): Double = sqrtIter(1.0, x)

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def improve(guess: Double, x: Double) = (guess + x / guess) / 2

  def isGoodEnough(guess: Double, x: Double) = Math.abs((guess * guess) - x) < 0.001

}
