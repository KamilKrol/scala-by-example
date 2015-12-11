/**
  * Created by kamil on 11.12.15.
  */
object Main5 {

  def main(args: Array[String]): Unit = {

    val list = List[Double](1, 2, 3, 4, 5)

    val scalledByHalf1 = scaleList1(list, 0.5)
    println(scalledByHalf1)

    val scalledByHalf2 = scaleList2(list, 0.5)
    println(scalledByHalf2)

  }

  def scaleList1(list: List[Double], factor: Double): List[Double] = list match {
    case Nil => list
    case head :: tail => head * factor :: scaleList1(tail, factor)
  }

  def scaleList2(list: List[Double], factor: Double): List[Double] =
    list.map(_ * factor)

}
