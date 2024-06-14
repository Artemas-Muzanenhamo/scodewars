package com.artemas.codewars.fundamentals.kyu8

class AsciiSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "getAscii" should "pass basic tests" in {
    val testCases = Seq(
      ('A', 65),
      ('\u0000', 0),
      ('a', 97),
      ('0', 48),
      ('\n', 10)
    )

    testCases.foreach {
      (ch, expected) =>
        assertResult(expected, s"\nInput\n ch = '$ch'")(getAscii(ch))
    }
  }
}