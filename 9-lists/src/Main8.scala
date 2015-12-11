/**
  * Created by kamil on 11.12.15.
  */
object Main8 {

  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4, 5)

    println(list.forall(_ > 0))
    println(list.forall(_ > 2))

    println

    println(list.exists(_ > 0))
    println(list.exists(_ > 2))

    println

    for (i <- 1 to 25)
      println("isPrime(" + i + ") = " + isPrime(i))
  }

  def isPrime(n: Int) =
    List.range(2, n).forall(x => n % x != 0)

}
