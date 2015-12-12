/**
  * Created by kamil on 12.12.15.
  */
object Main1 {

  def main(args: Array[String]): Unit = {

    var i = 0
    repeatLoop {
      println(i); i += 1
    }(i < 5)

  }

  def repeatLoop(command: => Unit)(condition: => Boolean) {
    if (condition) {
      command
      repeatLoop(command)(condition)
    }
  }

}
