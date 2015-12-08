import scala.annotation.tailrec

/**
  * Created by kamil on 08.12.15.
  */
object Main4 {

  def main(args: Array[String]): Unit = {

    for (i <- 1 to 10)
      println("factorial(" + i + ") = " + factorial(i))
  }

  def factorial(n: Int): Int = {
    @tailrec def iter(currentN: Int, result: Int): Int =
      if (currentN > n) result else iter(currentN + 1, currentN * result)
    iter(1, 1)
  }

}
