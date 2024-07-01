package First

object demo {
  def reverseString(str: String): String = {
    if (str.isEmpty) ""
    else reverseString(str.tail) + str.head
  }

  def main(args: Array[String]): Unit = {
    val input = "hello"
    val reversed = reverseString(input)
    println(s"Original: $input")
    println(s"Reversed: $reversed")
  }
}