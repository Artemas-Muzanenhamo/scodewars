package com.artemas.codewars.fundamentals.kyu8

class CharSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "getChar" should "pass basic tests" in {
    val testCases = Seq(
      (65, 'A'),
      (33, '!'),
      (36, '$'),
      (37, '%'),
      (38, '&')
    )

    testCases.foreach {
      (c, expected) =>
        assertResult(expected, s"\nInput:\n c = $c")(getChar(c))
    }
  }
}