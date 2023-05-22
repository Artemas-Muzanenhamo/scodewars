package com.artemas.codewars.fundamentals.kyu8

import org.scalatest.flatspec.AnyFlatSpec

class PalindromeSpec extends AnyFlatSpec {
  "isPalindrome" should "pass fixed tests" in {
    val testCases = List(
      ("a", true),
      ("aba", true),
      ("Abba", true),
      ("malam", true),
      ("walter", false),
      ("kodok", true),
      ("Kasue", false),
      ("hello", false),
      ("Bob", true),
      ("Madam", true),
      ("AbBa", true),
      ("", true),
      ("LAGrALLyiclOaEowNvmU", false),
      ("cWalaIYFGucHEhbnEH", false),
      ("smlWLKQYCrRUcqOLYuGGuYLOqcURrCYQKLWlms", true),
      ("dRjLeHcvvcHeLjRd", true),
      ("wvvqHAfrFWkIYygRQHTR", false),
      ("zuKWoAyeQNvhurRlYlUUlYlRruhvNQeyAoWKuz", true),
      ("QtFpQMSYPMnnMPYSMQpFtQ", true),
      ("muNcdggdcNum", true),
      ("TUkKinLuE", false),
      ("MaKeRSDisini", false)
    )

    testCases.foreach {
      case (s, expected) => assertResult(expected, s"\nInput\n  s = $s") (isPalindrome(s))
    }
  }
}