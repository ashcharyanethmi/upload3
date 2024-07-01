
  object demo {
    def filterLongStrings(strings: List[String]): List[String] = {
      strings.filter(_.length > 5)
    }

    def main(args: Array[String]): Unit = {
      val input = List("hello", "world", "scala", "programming", "strings", "example")
      val result = filterLongStrings(input)
      println(s"Original list: $input")
      println(s"Filtered list: $result")
    }

}