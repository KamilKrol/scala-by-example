/**
  * Created by kamil on 07.12.15.
  */
object Main2 {

  def loop: Int = {
    Thread sleep 500
    println("Looping")
    loop
  }

  def constOne(x: Int, y: => Int) = 1

  def main(args: Array[String]): Unit = {

    println(constOne(1, loop))
//    println(constOne(loop, 1))

  }

}
