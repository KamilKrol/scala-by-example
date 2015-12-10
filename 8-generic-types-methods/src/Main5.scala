
/**
  * Created by kamil on 10.12.15.
  */
object Main5 {

  def main(args: Array[String]): Unit = {

    //    val notCovariant: NotCovariant[A] = new NotCovariant[B]

    val covariant: Covariant[A] = new Covariant[B]
    println(covariant)

    val contrcovariant: ContrCovariant[B] = new ContrCovariant[A]
    println(contrcovariant)

  }

  class NotCovariant[T]

  class Covariant[+T]

  class ContrCovariant[-T]

  class A

  class B extends A

}
