package sets

/**
  * Created by kamil on 08.12.15.
  */
trait IntSet {

  def incl(x: Int): IntSet

  def contains(x: Int): Boolean

}
