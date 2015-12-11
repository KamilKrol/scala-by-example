/**
  * Created by kamil on 11.12.15.
  */
object Main10 {

  def main(args: Array[String]): Unit = {

    val list = List(List(1, 2), List(3, 4), List(5, 6))

    println(flatten(list))

  }

  def flatten[T](list: List[List[T]]): List[T] =
    (list :\ (Nil: List[T])) { (x, xs) => x ::: xs }

}
