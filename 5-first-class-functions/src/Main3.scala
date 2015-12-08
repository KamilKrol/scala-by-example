

/**
  * Created by kamil on 08.12.15.
  */
object Main3 {

  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4, 5)
    val mappedList = process(list, _ * 3)

    println("mappedList = " + mappedList)

  }

  def process(list: List[Int], f: Int => Int): List[Int] =
    list.map(f)

}
