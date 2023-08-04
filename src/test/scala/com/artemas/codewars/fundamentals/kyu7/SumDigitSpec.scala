package com.artemas.codewars.fundamentals.kyu7

class SumDigitSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "sumDigits" should "pass basic tests" in {
    val testCases = Seq(
      (10, 1),
      (99, 18),
      (-32, 5),
      (1234567890, 45),
      (0, 0),
      (666, 18),
      (100000002, 3),
      (800000009, 17)
    )

    testCases.foreach {
      (n, expected) => assertResult(expected, s"\nInput:\n n = $n")(sumDigits(n))
    }
  }
}