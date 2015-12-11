
/**
  * Created by kamil on 11.12.15.
  */
object Main7 {

  def main(args: Array[String]): Unit = {

    val f: (AnyRef => Int) = x => x.hashCode()
    val g: (String => Int) = f

    val name = "Kamil"
    println(f(name))
    println(g(name))

  }

}
