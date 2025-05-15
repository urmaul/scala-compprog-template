@main def main(): Unit =
  val reader = scala.io.Source.stdin.bufferedReader()

  val n = reader.readLine().toInt
  val a = reader.readLine().split(" ").filter(_.nonEmpty).map(_.toInt).toVector

  val result = sum(a)

  println(result)

def sum(a: Seq[Int]): Int =
  a.sum
