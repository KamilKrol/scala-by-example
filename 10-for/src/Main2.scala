/**
  * Created by kamil on 12.12.15.
  */
object Main2 {

  val books: List[Book] = List(
    Book(
      "Structure and Interpretation of Computer Programs",
      "Abelson, Harold", "Sussman, Gerald J."),
    Book(
      "Principles of Compiler Design",
      "Aho, Alfred", "Ullman, Jeffrey"),
    Book(
      "Programming in Modula-2",
      "Wirth, Niklaus"),
    Book(
      "Elements of ML Programming",
      "Ullman, Jeffrey"),
    Book(
      "The Java Language Specification", "Gosling, James",
      "Joy, Bill", "Steele, Guy", "Bracha, Gilad"))

  def main(args: Array[String]): Unit = {

    val ullmanBooks = for (b <- books; a <- b.authors if a startsWith "Ullman") yield b.title
    println(ullmanBooks)

    val authorsWithMultipleBooks = for (b1 <- books; b2 <- books if b1 != b2;
                                        a1 <- b1.authors; a2 <- b2.authors if a1 == a2) yield a1
    println(authorsWithMultipleBooks)
    println(removeDuplicates(authorsWithMultipleBooks))

    def removeDuplicates[T](list: List[T]): List[T] =
      if (list.isEmpty) list
      else list.head :: removeDuplicates(list.tail.filter(x => x != list.head))

  }

  case class Book(title: String, authors: String*)

}
