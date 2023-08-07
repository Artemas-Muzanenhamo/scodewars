package com.artemas.codewars.fundamentals.kyu7

class BinSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "binSeqToInt" should "pass basic tests" in {
    val testCases = Seq(
      (Seq(0,0,0,1), 1),
      (Seq(0,0,1,0), 2),
      (Seq(1,1,1,1), 15),
      (Seq(0,1,1,0), 6)
    )

    testCases.foreach {
      case (xs, expected) =>
        assertResult(expected, s"\nInput:\n xs = $xs")(binSeqToInt(xs))
    }
  }
}