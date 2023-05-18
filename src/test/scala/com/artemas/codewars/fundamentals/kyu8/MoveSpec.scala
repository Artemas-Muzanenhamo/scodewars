package com.artemas.codewars.fundamentals.kyu8

import org.scalatest._
import flatspec._

class MoveSpec extends AnyFlatSpec {
  it should "pass basic tests" in {
    val testCases = List( //(pos, roll, expected)
      (0, 4, 8),
      (3, 6, 15),
      (2, 5, 12)
    )

    testCases.foreach {
      case (pos, roll, expected) => assertResult(expected, s"\nInputs:\n  pos = $pos\n  roll = $roll") {move(pos, roll)}
    }
  }
}