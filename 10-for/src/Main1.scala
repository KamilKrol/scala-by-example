/**
  * Created by kamil on 11.12.15.
  */
object Main1 {

  def main(args: Array[String]): Unit = {

    val list = for (i <- 1 to 20) yield i
    println(list)

    val values = for {
      i <- 1 to 50
      j <- 1 to 50
      if (isPrime(i + j))
    } yield (i, j)

    println(values)

  }

  def isPrime(v: Int): Boolean =
    Range(2, v).forall(i => v % i != 0)

}
