//> using test.dep org.scalatest::scalatest::3.2.19
//> using file main.scala

import org.scalatest._
import org.scalatest.funsuite._

class Tests extends AnyFunSuite {
  test("math still works") {
    assert(sum(Vector(1, 2, 3)) == 6)
  }
}
