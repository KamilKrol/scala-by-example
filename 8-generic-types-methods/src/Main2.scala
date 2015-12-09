import stacks._

/**
  * Created by kamil on 08.12.15.
  */
object Main2 {

  def main(args: Array[String]): Unit = {

    val stack = new EmptyStack[Int].push(1).push(2).push(3)
    val properPrefix = new EmptyStack[Int].push(2).push(3)
    val wrongPrefix = new EmptyStack[Int].push(2).push(1)

    println(isPrefix(properPrefix, stack))
    println(isPrefix(wrongPrefix, stack))

    println

    val s1 = new EmptyStack[String].push("abc")
    val s2 = new EmptyStack[String].push("abx").push(s1.top)
    println(isPrefix(s1, s2))

  }

}
