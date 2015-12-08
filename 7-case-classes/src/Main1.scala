import classes.{Number, Sum}

/**
  * Created by kamil on 08.12.15.
  */
object Main1 {

  def main(args: Array[String]): Unit = {

    val sum1 = Sum(Sum(Number(1), Number(2)), Number(3))
    println("sum1 = " + sum1)

  }

}
