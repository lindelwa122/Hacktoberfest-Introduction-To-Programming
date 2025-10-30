import scala.io.StdIn

object SquaresSum {
    def main(args: Array[String]) : Unit = {
      print("Enter a number greater than 0: ")
      val n: Int = StdIn.readLine().toInt
      val sumOfSquares: Int = (1 until n).map(i => i * i).sum
      println(f"The sum of the squares less than $n, is $sumOfSquares")
    }

}