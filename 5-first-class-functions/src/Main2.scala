import scala.annotation.tailrec

/**
  * Created by kamil on 08.12.15.
  */
object Main2 {

  def main(args: Array[String]): Unit = {

    def sumInts1 = sum1(x => x)
    def sumSquares1 = sum1(x => x * x)

    println("sumInts1(1, 5) = " + sumInts1(1, 5))
    println("sumSquares1(1, 5) = " + sumSquares1(1, 5))

    def sumInts2 = sum2(x => x) _
    def sumSquares2 = sum2(x => x * x) _

    println("sumInts2(1, 5) = " + sumInts2(1, 5))
    println("sumSquares2(1, 5) = " + sumSquares2(1, 5))

    def sumInts3 = sum3(x => x) _
    def sumSquares3 = sum3(x => x * x) _

    println("sumInts3(1, 5) = " + sumInts3(1, 5))
    println("sumSquares3(1, 5) = " + sumSquares3(1, 5))

  }

  def sum1(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int = {
      if (a > b) 0 else f(a) + sumF(a + 1, b)
    }
    sumF
  }

  def sum2(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum2(f)(a + 1, b)

  def sum3(f: Int => Int)(a: Int, b: Int): Int = {
    @tailrec def iter(a: Int, result: Int): Int = {
      if (a > b) result
      else iter(a + 1, result + f(a))
    }
    iter(a, 0)
  }

}
