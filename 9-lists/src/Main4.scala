/**
  * Created by kamil on 11.12.15.
  */
object Main4 {

  def main(args: Array[String]): Unit = {

    val keys = List(1,2,3)
    val values = List("one", "two", "three")

    val zippedList = keys.zip(values)
    println(zippedList)

    val concatenatedList = keys ::: values
    println(concatenatedList)

    val reversedList = keys.reverse
    println(reversedList)

  }

}
