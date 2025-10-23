import scala.io.StdIn

object AddUserInputs {
    def main(args: Array[String]): Unit = {
      print("Enter a value for integer X: ")
      val x: Int = StdIn.readLine().toInt
      print("Enter a value for integer Y: ")
      val y: Int = StdIn.readLine().toInt

      val sum: Int = x + y
      println(f"Answer is $sum!")
    }
}