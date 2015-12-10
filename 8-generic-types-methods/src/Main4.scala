import nums._
import sets._

/**
  * Created by kamil on 10.12.15.
  */
object Main4 {

  def main(args: Array[String]): Unit = {

    val set = new EmptySet[Int].incl(1).incl(2).incl(3)
    for (i <- 0 to 5)
      println("set.incl(" + i + ") = " + set.contains(i))

  }

}
