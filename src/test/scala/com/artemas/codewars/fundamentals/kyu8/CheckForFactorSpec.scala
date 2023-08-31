package com.artemas.codewars.fundamentals.kyu8

import org.scalatest._
import flatspec._

class CheckForFactorSpec extends AnyFlatSpec {
  it should "pass basic tests" in {
    val testCases = List( //(base, factor, expected)
      (10, 2, true),
      (63, 7, true),
      (2450, 5, true),
      (24612, 3, true),
      (9, 2, false),
      (653, 7, false),
      (2453, 5, false),
      (24617, 3, false)
    )

    testCases.foreach {
      case (base, factor, expected) => assertResult(expected, s"\nInputs:\n  base = $base\n  factor = $factor") {checkForFactor(base, factor)}
    }
  }
}