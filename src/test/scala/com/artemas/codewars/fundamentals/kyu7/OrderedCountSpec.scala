package com.artemas.codewars.fundamentals.kyu7

class OrderedCountSpec extends org.scalatest.flatspec.AnyFlatSpec  {
  "orderedCount" should "pass example tests" in {
    assertResult(List(), "\nInput:\n  chars =\"\"") (OrderedCount.orderedCount(""))
    assertResult(List(('a', 5), ('b', 2), ('r', 2), ('c', 1), ('d', 1)), "\nInput:\n  chars = \"abracadabra\"") (OrderedCount.orderedCount("abracadabra"))
    assertResult(List(('C', 1), ('o', 1), ('d', 1), ('e', 1), (' ', 1), ('W', 1), ('a', 1), ('r', 1), ('s', 1)), "\nInput:\n  chars = \"Code Wars\"") (OrderedCount.orderedCount("Code Wars"))
  }
}