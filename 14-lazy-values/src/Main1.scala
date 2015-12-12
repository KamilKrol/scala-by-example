/**
  * Created by kamil on 12.12.15.
  */
object Main1 {

  def main(args: Array[String]): Unit = {

    println("Before create - normal")
    val kamil = Person("Kamil")
    println("After create - normal")
    println("Print - normal - par1 = " + kamil.par1 + " par2 = " + kamil.par2)

    println("Before create - lazy")
    val lazyKamil = LazyPerson("Kamil")
    println("After create - lazy")
    println("Print - lazy - par1 = " + lazyKamil.par1 + " par2 = " + lazyKamil.par2)


  }

  case class Person(name: String) {
    val par1 = {Thread sleep 5000; 1}
    val par2 = {Thread sleep 5000; 2}
  }

  case class LazyPerson(name: String) {
    lazy val par1 = {Thread sleep 5000; 1}
    lazy val par2 = {Thread sleep 5000; 2}
  }

}
