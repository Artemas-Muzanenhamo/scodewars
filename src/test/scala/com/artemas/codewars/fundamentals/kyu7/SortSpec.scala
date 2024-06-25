package com.artemas.codewars.fundamentals.kyu7

class SortSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "sol" should "pass basic tests" in {
    val testCases = List[(List[Int], List[Int])](
      (List(1, 2, 3, 10, 5), List(1, 2, 3, 5, 10)),
      (List[Int](), List[Int]()),
      (List(20, 2, 10), List(2, 10, 20)),
      (List(2, 20, 10), List(2, 10, 20))
    )

    testCases.foreach {
      case (nums, expected) => assertResult(expected, s"\nInput\n  nums = $nums") (sol(nums))
    }
  }
}