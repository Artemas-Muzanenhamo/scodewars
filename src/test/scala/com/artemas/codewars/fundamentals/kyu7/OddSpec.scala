package com.artemas.codewars.fundamentals.kyu7

class OddSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "noOdds" should "pass basic tests" in {
    val testCases = List[(List[Int], List[Int])](
      (List(0, 1), List(0)),
      (List(0, 1, 2, 3), List(0, 2)),
      (List(1, 3, 5, 7, 9), List()),
      (List(0, 2, 4, 6, 8, 10), List(0, 2, 4, 6, 8, 10)),
      (List(-1, -3, -5, -7, -9), List()),
      (List(2, 4, 8, 6, 0), List(2, 4, 8, 6, 0)),
      (List(), List())
    )

    testCases.foreach {
      case (values, expected) => assertResult(expected, s"\nInput\n  values = $values") (noOdds(values))
    }
  }
}