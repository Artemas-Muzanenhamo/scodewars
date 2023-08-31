package com.artemas.codewars.fundamentals.kyu7

import org.scalatest._
import flatspec._
import matchers.should._

class ListFilteringTest extends AnyFlatSpec with Matchers {

  val tests = List(
    (List(1, 2, "a", "b"), List(1, 2)),
    (List(1, "a", "b", 0, 15), List(1, 0, 15)),
    (List(1, 2, "aasf", "1", "123", 123), List(1, 2, 123)),
    (List("a", "b", "1"), Nil)
  )

  tests.foreach {
    case (input, expected) =>
      s"filterList($input)" should s"return $expected" in {
        filterList(input) should be (expected)
      }
  }
}