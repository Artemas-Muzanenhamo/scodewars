package com.artemas.codewars.fundamentals.kyu7

class EndSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "solution" should "pass basic tests" in {
    val testCases = Seq(
      ("samurai", "ai", true),
      ("ninja", "ja", true),
      ("sensei", "i", true),
      ("abc", "abc", true),
      ("abcabc", "bc", true),
      ("fails", "ails", true),
      ("test", "", true),
      ("sumo", "omo", false),
      ("samurai", "ra", false),
      ("abc", "abcd", false),
      ("ails", "fails", false),
      ("this", "fails", false),
      ("spam", "eggs", false)
    )

    testCases.foreach {
      case (s, e, expected) =>
        assertResult(expected, s"\nInputs:\n s = \"$s\"\n e = \"$e\"")(endsWithKata(s, e))
    }
  }
}