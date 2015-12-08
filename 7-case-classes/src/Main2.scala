import classes.{Expr, Number, Sum}

/**
  * Created by kamil on 08.12.15.
  */
object Main2 {

  def main(args: Array[String]): Unit = {

    val sum1 = Sum(Number(1), Number(2))
    println("eval(sum1) = " + eval(sum1))
    println("sum1.eval = " + sum1.eval)

    println

    val sum2 = Sum(sum1, Number(3))
    println("eval(sum2) = " + eval(sum2))
    println("sum2.eval = " + sum2.eval)

  }

  def eval(e: Expr): Int = e match {
    case Number(n) => n
    case Sum(e1, e2) => eval(e1) + eval(e2)
  }

}
