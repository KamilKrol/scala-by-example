package sets

/**
  * Created by kamil on 08.12.15.
  */
class EmptySet extends IntSet {

  override def incl(x: Int): IntSet = new NonEmptySet(x, new EmptySet, new EmptySet)

  override def contains(x: Int): Boolean = false
}
