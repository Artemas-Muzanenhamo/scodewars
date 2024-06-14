package com.artemas.codewars.fundamentals.kyu8

import org.scalatest._
import flatspec._

class SimpleMultiplicationSpec extends AnyFlatSpec {

  val tests = List( // (input, expected)
    (1, 9),
    (3, 27),
    (2, 16),
    (4, 32)
  )

  tests.foreach {
    case (input, expected) =>
      s"multiply($input)" should s"return $expected" in {
        assertResult(expected) {SimpleMultiplication.multiply(input)}
      }
  }
}