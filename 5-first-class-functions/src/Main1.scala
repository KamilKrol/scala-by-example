/**
  * Created by kamil on 07.12.15.
  */
object Main1 {

  def main(args: Array[String]): Unit = {

    println(sumInts1(1, 5) + " v " + sumInts2(1, 5))
    println(sumSquares1(1, 5) + " v " + sumSquares2(1, 5))
    println(sumPowersOfTwo1(1, 5) + " v " + sumPowersOfTwo2(1, 5))

  }

  /* Dummy implementations */
  def sumInts1(a: Int, b: Int): Int =
    if (a > b) 0 else a + sumInts1(a + 1, b)

  def sumSquares1(a: Int, b: Int): Int =
    if (a > b) 0 else square(a) + sumSquares1(a + 1, b)

  def sumPowersOfTwo1(a: Int, b: Int): Int =
    if (a > b) 0 else powerOfTwo(a) + sumPowersOfTwo1(a + 1, b)

  /* A bit more generic implementations */
  def sumInts2(a: Int, b: Int): Int = sumGeneric(id, a, b)

  def sumSquares2(a: Int, b: Int): Int = sumGeneric(square, a, b)

  def sumPowersOfTwo2(a: Int, b: Int): Int = sumGeneric(powerOfTwo, a, b)

  def sumGeneric(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sumGeneric(f, a + 1, b)

  /* Simple operations. */
  def id(value: Int): Int = value

  def square(value: Int): Int = value * value

  def powerOfTwo(value: Int): Int =
    if (value == 0) 1 else 2 * powerOfTwo(value - 1)
}
