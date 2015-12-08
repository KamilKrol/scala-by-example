package sets

/**
  * Created by kamil on 08.12.15.
  */
class NonEmptySet(value: Int, left: IntSet, right: IntSet) extends IntSet {

  override def incl(x: Int): IntSet = {
    if (x < value) new NonEmptySet(value, left incl x, right)
    else if (x > value) new NonEmptySet(value, left, right incl x)
    else this
  }

  override def contains(x: Int): Boolean = {
    if (x < value) left contains x
    else if (x > value) right contains x
    else true
  }
}
