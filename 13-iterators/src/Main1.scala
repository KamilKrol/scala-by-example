/**
  * Created by kamil on 12.12.15.
  */
object Main1 {

  def main(args: Array[String]): Unit = {

    val iterator = Iterator.range(1, 5)
    while (iterator.hasNext) println(iterator.next)

    println

    val iteratorA = Iterator.range(1, 5)
    val mappedIterator = iteratorA.map(_ * 5)

    while (mappedIterator.hasNext) println(mappedIterator.next)

  }

}
