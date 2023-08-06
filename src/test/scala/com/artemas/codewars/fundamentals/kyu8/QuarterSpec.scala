package com.artemas.codewars.fundamentals.kyu8

class QuarterSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "quarterOf" should "pass basic tests" in {
    val testCases = Seq(
      (3, 1),
      (8, 3),
      (11, 4)
    )

    testCases.foreach {
      (month, expected) =>
        assertResult(expected, s"\nInput:\n month = $month")(quarterOf(month))
    }
  }
}