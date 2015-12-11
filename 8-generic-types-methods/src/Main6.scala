
/**
  * Created by kamil on 11.12.15.
  */
object Main6 {

  def main(args: Array[String]): Unit = {

    val tuple = (1, 2)
    println("tuple = " + tuple)
    println("tuple._1 = " + tuple._1 + " tuple._2 = " + tuple._2)

    println

    val megaTuple = (1, 2, 3, 4, 5)
    println("megaTuple = " + megaTuple)
    println("megaTuple._5 = " + megaTuple._5)

    println

    println("divmod(5, 2) = " + divmod(5, 2))

  }

  def divmod(x: Int, y: Int) = (x / y, x % y)

}
