package sets

/**
  * Created by kamil on 08.12.15.
  */
object EmptySet extends IntSet {

  override def incl(x: Int): IntSet = new NonEmptySet(x, EmptySet, EmptySet)

  override def contains(x: Int): Boolean = false
}
