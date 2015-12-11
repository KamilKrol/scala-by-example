/**
  * Created by kamil on 11.12.15.
  */
object Main7 {

  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4, 5)
    val filteredList = list.filter(_ > 2)
    println(filteredList)

  }

  def filter[T](list: List[T], f: T => Boolean): List[T] = list match {
    case Nil => Nil
    case head :: tail => if (f(head)) head :: filter(tail, f) else filter(tail, f)
  }

}
