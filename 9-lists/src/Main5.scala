/**
  * Created by kamil on 11.12.15.
  */
object Main5 {

  def main(args: Array[String]): Unit = {

    val list = List[Double](1, 2, 3, 4, 5)
    val scalledByHalf = scaleList(list, 0.5)
    println(scalledByHalf)

  }

  def scaleList(list: List[Double], factor: Double): List[Double] = list match {
    case Nil => list
    case head :: tail => head * factor :: scaleList(tail, factor)
  }

}
