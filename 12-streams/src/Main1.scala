/**
  * Created by kamil on 12.12.15.
  */
object Main1 {

  def main(args: Array[String]): Unit = {

    val sum = Stream.range(1, 10).sum
    println(sum)

    val all = Stream.range(1, 25)
    val odd = all.filter(!isEven(_))
    val even = all.filter(isEven)
    print(odd)
    println(even)

  }

  def isEven(value: Int): Boolean = value % 2 == 0

  def print[T](stream: Stream[T]): Unit = {
    if (!stream.isEmpty) {
      Console.print(stream.head + " "); print(stream.tail)
    } else
      println
  }

}
