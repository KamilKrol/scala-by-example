/**
  * Created by kamil on 08.12.15.
  */

package object stacks {

  abstract class Stack[T] {
    def push(x: T): Stack[T] = new NotEmptyStack(x, this)

    def isEmpty: Boolean

    def top: T

    def pop: Stack[T]
  }

  class EmptyStack[T] extends Stack[T] {
    override def isEmpty: Boolean = true

    override def top: T = sys.error("EmptyStack.top")

    override def pop: Stack[T] = sys.error("EmptyStack.pop")
  }

  class NotEmptyStack[T](elem: T, rest: Stack[T]) extends Stack[T] {
    override def isEmpty: Boolean = false

    override def top: T = elem

    override def pop: Stack[T] = rest
  }

  def isPrefix[T](prefix: Stack[T], stack: Stack[T]): Boolean =
    prefix.isEmpty || (prefix.top == stack.top && isPrefix(prefix.pop, stack.pop))

}