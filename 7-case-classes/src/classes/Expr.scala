package classes

/**
  * Created by kamil on 08.12.15.
  */
abstract class Expr {
  def eval: Int = this match {
    case Number(n) => n
    case Sum(e1, e2) => e1.eval + e2.eval
  }
}