/**
  * Created by kamil on 11.12.15.
  */
object Main1 {

  def main(args: Array[String]): Unit = {

    val list = "a" :: Nil
    println(list)

    println

    val fruits = "apples" :: ("oranges" :: ("pears" :: Nil))
    println(fruits)
    println(fruits.head)
    println(fruits.tail)

    println

    val numbers = List(1,7,0,10,14,12)
    val sortedNumbers = isort(numbers)
    println("numbers = " + numbers)
    println("sortedNumbers = " + sortedNumbers)

  }

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
  }

  def isort(xs: List[Int]): List[Int] =
    if (xs.isEmpty) Nil
    else insert(xs.head, isort(xs.tail))

}
