
/**
  * Created by kamil on 08.12.15.
  */
object Main5 {

  val tolerance = 0.0001

  def main(args: Array[String]): Unit = {

    def sqrt(x: Double) = fixedPoint(y => (y + x / y) / 2)(1.0)
    sqrt(2)

    println

    def sqrt2(x: Double) = fixedPoint(averageDamp(y => x / y))(1.0)
    sqrt2(2)

  }

  def isCloseEnough(x: Double, y: Double) = math.abs((x - y) / x) < tolerance

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      println("next = " + next)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  }

  def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2


}
