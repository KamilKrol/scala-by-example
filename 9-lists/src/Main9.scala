/**
  * Created by kamil on 11.12.15.
  */
object Main9 {

  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4, 5)

    println(sum(list))
    println(product(list))

    val betterSum1 = list.reduceLeft((x, y) => x + y)
    val betterProduct1 = list.reduceLeft((x, y) => x * y)

    println(betterSum1)
    println(betterProduct1)

    val betterSum2 = list.foldLeft(0)(_ + _)
    val betterProduct2 = list.foldLeft(1)(_ * _)

    println(betterSum2)
    println(betterProduct2)

  }

  def sum(list: List[Int]): Int = list match {
    case Nil => 0
    case head :: tail => head + sum(tail)
  }

  def product(list: List[Int]): Int = list match {
    case Nil => 1
    case head :: tail => head * product(tail)
  }

}
