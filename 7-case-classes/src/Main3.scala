import trees._

/**
  * Created by kamil on 08.12.15.
  */
object Main3 {

  def main(args: Array[String]): Unit = {

    var tree: IntTree = EmptyTree
    tree = insert(tree, 1)
    tree = insert(tree, 2)
    tree = insert(tree, 3)

    for (i <- 0 to 10) {
      println("contains(tree, " + i + ") = " + contains(tree, i))
    }
  }

}
