package com.artemas.codewars.fundamentals.kyu8

class RegularBallSuperBallSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "Ball.ballType" should "be \"regular\" if no argument is given" in {
    assertResult("regular") {
      val b = Ball()
      b.ballType
    }
  }

  it should "be equal to the argument given" in {
    val testCases = List(
      "regular",
      "super",
      "other"
    )

    testCases.foreach {
      case ballType => assertResult(ballType) {
        val b = Ball(ballType)
        b.ballType
      }
    }
  }
}
