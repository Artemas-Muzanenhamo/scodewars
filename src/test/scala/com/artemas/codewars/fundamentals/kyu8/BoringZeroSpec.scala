package com.artemas.codewars.fundamentals.kyu8

class BoringZeroSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "noBoringZeroes" should "pass basic tests" in {
    val testCases = Seq(
      (1450, 145),
      (960000, 96),
      (1050, 105),
      (-1050, -105),
      (0, 0),
      (2016, 2016)
    )

    testCases.foreach {
      (n, expected) =>
        assertResult(expected, s"\nInput:\n n = $n")(noBoringZeroes(n))
    }
  }
}