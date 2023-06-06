package com.artemas.codewars.fundamentals.kyu7

import org.scalatest.*
import org.scalatest.flatspec.*

class ReverseWordsSpec extends AnyFlatSpec {
  it should "pass basic tests" in { //text, expected
    val testCases = List(
      ("The quick brown fox jumps over the lazy dog.", "ehT kciuq nworb xof spmuj revo eht yzal .god"),
      ("apple", "elppa"),
      ("a b c d", "a b c d"),
      ("double  spaced  words", "elbuod  decaps  sdrow")
    )

    testCases.foreach {
      case (text, expected) => assertResult(expected, s"\nInput:\n  text = $text") {reverseWords(text)}
    }
  }
}