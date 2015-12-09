/**
  * Created by kamil on 08.12.15.
  */

package object nums {

  case class Num(value: Double) extends Ordered[Num] {
    override def compare(that: Num): Int =
      if (this.value < that.value) -1
      else if (this.value > that.value) 1
      else 0
  }

}