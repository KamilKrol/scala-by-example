/**
  * Created by kamil on 11.12.15.
  */
object Main3 {

  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4, 5)
    println(list.take(1))
    println(list.take(2))

    println

    println(list.drop(1))
    println(list.drop(2))

    println

    println(list.splitAt(2))
    println(list.splitAt(3))

    println

    println(list.apply(1))
    println(list.apply(2))

    println

    println(list(1))
    println(list(2))

    println

    println(sublist(list, 1, 3))

  }

  def sublist[T](list: List[T], m: Int, n: Int): List[T] =
    list.drop(m).take(n - m)

}
