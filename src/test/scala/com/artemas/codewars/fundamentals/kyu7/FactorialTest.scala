package com.artemas.codewars.fundamentals.kyu7

import org.scalatest._
import flatspec._

class FactorialTest extends AnyFlatSpec {
  it should "pass basic tests" in {
    val testCases = List( //n, expected
      (0, 1),
      (1, 1),
      (2, 2),
      (3, 6),
      (4, 24),
      (5, 120),
      (6, 720),
      (7, 5040)
    )

    testCases.foreach {
      case (n, expected) => assertResult(expected, s"\nInput:\n  n = $n") {Factorial.!(n)}
    }
  }
}