import sets.{IntSet, EmptySet}

/**
  * Created by kamil on 08.12.15.
  */
object Main2 {

  def main(args: Array[String]): Unit = {

    var set: IntSet = EmptySet
    set = set.incl(1)
    set = set.incl(2)
    set = set.incl(3)

    for (i <- 0 to 10) {
      println("set.contains(" + i + ") = " + set.contains(i))
    }

  }

}
