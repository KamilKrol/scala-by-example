/**
  * Created by kamil on 08.12.15.
  */

package object trees {

  abstract class IntTree

  case object EmptyTree extends IntTree

  case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree

  def contains(t: IntTree, v: Int): Boolean = t match {
    case EmptyTree => false
    case Node(elem, left, right) =>
      if (v < elem) contains(left, v)
      else if (v > elem) contains(right, v)
      else true

  }

  def insert(t: IntTree, v: Int): IntTree = t match {
    case EmptyTree => Node(v, EmptyTree, EmptyTree)
    case Node(elem, left, right) =>
      if (v < elem) Node(elem, insert(left, v), right)
      else if (v > elem) Node(elem, left, insert(right, v))
      else t

  }

}