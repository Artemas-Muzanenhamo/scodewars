package com.artemas.codewars.fundamentals.kyu8

class ReverseSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "reverseList" should "pass basic tests" in {
    val testCases = Seq(
      (List(1, 2, 3, 4), List(4, 3, 2, 1)),
      (List(3, 1, 5, 4), List(4, 5, 1, 3)),
      (List(3, 6, 9, 2), List(2, 9, 6, 3)),
      (List(1), List(1)),
      (List[Int](), List[Int]())
    )

    testCases.foreach {
      (xs, expected) =>
        assertResult(expected, s"\nInput:\n xs = $xs")(reverseList(xs))
    }
  }
}