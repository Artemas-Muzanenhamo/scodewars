package com.artemas.codewars.fundamentals.kyu8

import org.scalatest.flatspec.AnyFlatSpec

class SquareSpec extends AnyFlatSpec {
  "square" should "pass basic tests" in {
    assertResult(1, "\nInput\n  n = 1") (square(1))
    assertResult(4, "\nInput\n  n = 2") (square(2))
    assertResult(2500, "\nInput\n  n = 50") (square(50))
  }
}