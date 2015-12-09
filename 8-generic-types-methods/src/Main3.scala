import nums._
import sets._

/**
  * Created by kamil on 09.12.15.
  */
object Main3 {

  def main(args: Array[String]): Unit = {

    val set = new EmptySet[Num].incl(Num(1)).incl(Num(2)).incl(Num(3))
    for (i <- 0 to 5)
      println("set.incl(" + i + ") = " + set.contains(Num(i)))

  }

}
