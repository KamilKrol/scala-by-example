import scala.annotation.tailrec

/**
  * Created by kamil on 07.12.15.
  */
object Main4 {

  def main(args: Array[String]): Unit = {

    println(factorial1(5))
    println(factorial2(5))
  }

  def factorial1(n: Int): Int = if (n == 0) 1 else n * factorial1(n - 1)

  def factorial2(n: Int): Int = {
    @tailrec def factorialOptimum(n: Int, currentResult: Int): Int = if (n == 0) currentResult else factorialOptimum(n - 1, currentResult * n)
    factorialOptimum(n, 1)
  }

}
