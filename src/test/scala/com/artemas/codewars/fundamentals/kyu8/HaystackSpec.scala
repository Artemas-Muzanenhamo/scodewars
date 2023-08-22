package com.artemas.codewars.fundamentals.kyu8

import org.scalatest.flatspec.AnyFlatSpec

class HaystackSpec extends AnyFlatSpec {
  "findNeedle" should "pass basic tests" in {
    val testCases = List(
      (List("283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"), "found the needle at position 5"),
      (List("3", "123124234", "a brick", "needle", "hay", "some potatoes", "im running out of ideas here"), "found the needle at position 3"),
      (List("You", "have", "chosen", "to", "translate", "this", "kata.", "For", "your", "convenience", "we", "have", "provided", "the", "existing", "test", "cases", "used", "for", "the", "needle", "language", "that", "you", "have", "already", "completed,", "as", "well", "as", "all", "of", "the", "other", "related", "fields.", "View", "the", "help", "tab", "for", "more", "information", "on", "how", "kata", "translations", "work."), "found the needle at position 20")
    )

    testCases.foreach {
      case (haystack, expected) => assertResult(expected, s"\nInput\n  haystack = $haystack") (findNeedle(haystack))
    }
  }
}