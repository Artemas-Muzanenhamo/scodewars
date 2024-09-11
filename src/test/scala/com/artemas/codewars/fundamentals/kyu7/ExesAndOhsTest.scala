package com.artemas.codewars.fundamentals.kyu7

import org.scalatest._
import flatspec._
import matchers.should._

class ExesAndOhsTest extends AnyFlatSpec with Matchers {

  val tests = List(
    ("xo", true),
    ("xo0", true),
    ("xxxxxoooXooo", true),
    ("xxxoo", false)
  )

  tests.foreach {
    case (input, expected) =>
      s"xo($input)" should s"return $expected" in {
        ExesAndOhs.xo(input) should be (expected)
      }
  }
}