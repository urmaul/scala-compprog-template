@main def main() =
  val reader = scala.io.Source.stdin.bufferedReader()

  val n = reader.readLine().toInt
  // Read and parse line because `readInt()` consumes the whole line
  val a = reader.readLine().split(" ").map(_.toInt).toVector

  val result = sum(a)

  println(result)

def sum(a: Seq[Int]): Int =
  a.sum
