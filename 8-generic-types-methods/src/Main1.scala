import stacks._

/**
  * Created by kamil on 08.12.15.
  */
object Main1 {

  def main(args: Array[String]): Unit = {

    val x = new EmptyStack[Int]
    val y = x.push(1).push(2)

    println(y.top)
    println(y.pop.top)

  }

}
