/**
  * Created by kamil on 06.12.15.
  */
object Main1 {

  def main(args: Array[String]): Unit = {

    println("pre eagerValue")
    val eagerValue = {
      Thread sleep 5000
      5
    }
    println("post eagerValue")
    println("eagerValue = " + eagerValue)

    println("pre lazyValue")
    def lazyValue = {
      Thread sleep 5000
      5
    }
    println("post lazyValue")
    println("lazyValue = " + lazyValue)

  }

}
