package com.artemas.codewars.fundamentals.kyu7

class AnchorSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "removeUrlAnchor" should "pass basic tests" in {
    val testCases = List(
      ("www.codewars.com#about", "www.codewars.com"),
      ("www.codewars.com/katas/?page=1#about", "www.codewars.com/katas/?page=1"),
      ("www.codewars.com/katas/", "www.codewars.com/katas/")
    )

    testCases.foreach {
      case (url, expected) =>
        assertResult(expected, s"\nInput:\n  url = \"$url\"")(removeUrlAnchor(url))
    }
  }
}