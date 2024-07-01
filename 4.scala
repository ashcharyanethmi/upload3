package first

object demo {
  def sumOfEvens(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum
  }

  def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val result = sumOfEvens(input)
    println(s"Original list: $input")
    println(s"Sum of even numbers: $result")
  }
}
