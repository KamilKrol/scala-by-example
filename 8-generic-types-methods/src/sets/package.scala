/**
  * Created by kamil on 08.12.15.
  */

package object sets {

  trait Set[T <: Ordered[T]] {
    def incl(x: T): Set[T]

    def contains(x: T): Boolean
  }

  class EmptySet[T <: Ordered[T]] extends Set[T] {
    override def incl(x: T): Set[T] = new NonEmptySet(x, new EmptySet[T], new EmptySet[T])

    override def contains(x: T): Boolean = false
  }

  class NonEmptySet[T <: Ordered[T]](elem: T, left: Set[T], right: Set[T]) extends Set[T] {
    override def incl(x: T): Set[T] =
      if (x < elem) new NonEmptySet(elem, left incl x, right)
      else if (x > elem) new NonEmptySet(elem, left, right incl x)
      else this


    override def contains(x: T): Boolean =
      if (x < elem) left contains x
      else if (x > elem) right contains x
      else true
  }

}