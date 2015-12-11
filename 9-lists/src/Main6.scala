/**
  * Created by kamil on 11.12.15.
  */
object Main6 {

  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4, 5)
    val squaredList1 = squareList1(list)
    val squaredList2 = squareList2(list)

    println(squaredList1)
    println(squaredList2)

  }

  def squareList1(list: List[Int]): List[Int] = list match {
    case List() => Nil
    case y :: ys => y * y :: squareList1(ys)
  }

  def squareList2(list: List[Int]): List[Int] =
    list.map(x => x * x)

}
