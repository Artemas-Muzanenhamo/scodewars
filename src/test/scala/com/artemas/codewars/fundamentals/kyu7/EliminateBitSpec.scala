package com.artemas.codewars.fundamentals.kyu7

class EliminateBitSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "eliminateUnsetBits" should "pass basic tests" in {
    val testCases = Seq(
      ("11010101010101", 255),
      ("111", 7),
      ("1000000", 1),
      ("000", 0),
    )

    testCases.foreach {
      case (number, expected) =>
        assertResult(expected, s"\nInput\n number = \"$number\"")(eliminateUnsetBits(number))
    }
  }
}
