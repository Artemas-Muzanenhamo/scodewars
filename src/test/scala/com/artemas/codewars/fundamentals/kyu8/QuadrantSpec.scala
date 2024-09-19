package com.artemas.codewars.fundamentals.kyu8

class QuadrantSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "quadrant" should "pass basic tests" in {
    val testCases = Seq(
      (1, 2, 1),
      (3, 5, 1),
      (-10, 100, 2),
      (-1, -9, 3),
      (19, -56, 4),
      (1, 1, 1),
      (-60, -12, 3)
    )

    testCases foreach {
      (x, y, expected) =>
        assert(quadrant(x, y) == expected, s"for quadrant($x, $y)")
    }
  }
}