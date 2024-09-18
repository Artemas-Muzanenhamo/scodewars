package com.artemas.codewars.fundamentals.kyu8

import org.scalatest._
import flatspec._

class CountingSheepSpec extends AnyFlatSpec {

  val testCases = List( //(input, expected)
    (0, ""),
    (1, "1 sheep..."),
    (2, "1 sheep...2 sheep..."),
    (3, "1 sheep...2 sheep...3 sheep...")
  )

  testCases.foreach {
    case (input, expected) =>
      s"countingSheep($input)" should s"return \"$expected\"" in {
        assertResult(expected) {CountingSheep.countingSheep(input)}
      }
  }
}
