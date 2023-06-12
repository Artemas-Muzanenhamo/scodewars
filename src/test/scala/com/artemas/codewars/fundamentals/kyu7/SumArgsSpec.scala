package com.artemas.codewars.fundamentals.kyu7

import org.scalatest._
import flatspec._

class SumArgsSpec extends AnyFlatSpec {
  it should "pass basic tests" in {
    val testCases = List( // args, expected
      (List(1), 1),
      (List(1, 2), 3),
      (List(5, 7, 9), 21),
      (List(12, 1, 1, 1, 1), 16),
      (List(12, 1, 1, 1, 1, 1, 1), 18)
    )

    testCases.foreach {
      case (args, expected) => assertResult(expected, s"\nInput:\n  args = ${args.mkString(", ")}") {
        sumArgs(args: _*)
      }
    }
  }
}