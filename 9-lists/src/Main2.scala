/**
  * Created by kamil on 11.12.15.
  */
object Main2 {

  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4, 5)

    list match {
      case x :: y :: z => println("x = " + x + " y = " + y + " z = " + z)
      case _ => println("No match!")
    }

  }


}
