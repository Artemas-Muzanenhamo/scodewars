package com.artemas.codewars.fundamentals.kyu8

import org.scalatest._
import flatspec._

class HowMuchILoveYouSpec extends AnyFlatSpec {
  it should "pass basic tests" in {
    val testCases = List( //petals, expected
      (7, "I love you"),
      (3, "a lot"),
      (6, "not at all")
    )

    testCases.foreach {
      case (petals, expected) => assertResult(expected, s"\nInput:\n  petals = $petals") {howMuchILoveYou(petals)}
    }
  }
}