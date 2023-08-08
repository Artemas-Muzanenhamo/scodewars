package com.artemas.codewars.fundamentals.kyu8

class ReverseSeqSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "reverseSeq" should "pass basic tests" in {
    val testCases = List(
      (1, Seq(1)),
      (2, Seq(2, 1)),
      (3, Seq(3, 2, 1)),
      (4, Seq(4, 3, 2, 1)),
      (5, Seq(5, 4, 3, 2, 1)),
      (6, Seq(6, 5, 4, 3, 2, 1))
    )

    testCases.foreach {
      case (n, expected) =>
        assertResult(expected, s"\nInput:\n  n = $n")(reverseSeq(n))
    }
  }
}