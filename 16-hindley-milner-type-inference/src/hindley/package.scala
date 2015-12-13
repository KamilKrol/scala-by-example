/**
  * Created by kamil on 13.12.15.
  */
package object hindley {

  abstract class Term

  case class Var(x: String) extends Term {
    override def toString = x
  }

  case class Lam(x: String, e: Term) extends Term {
    override def toString = "(\\" + x + "." + e + ")"
  }

  case class Let(x: String, e: Term, f: Term) extends Term {
    override def toString = "let " + x + " = " + e + " in " + f
  }

  sealed abstract class Type

  case class Tyvar(a: String) extends Type {
    override def toString = a
  }

  case class Arrow(t1: Type, t2: Type) extends Type {
    override def toString = "(" + t1 + "->" + t2 + ")"
  }

  case class Tycon(k: String, ts: List[Type]) extends Type {
    override def toString =
      k + (if (ts.isEmpty) "" else ts.mkString("[", ",", "]"))
  }

}
