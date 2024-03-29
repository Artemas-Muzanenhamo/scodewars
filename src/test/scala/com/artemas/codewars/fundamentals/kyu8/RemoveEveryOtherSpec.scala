package com.artemas.codewars.fundamentals.kyu8

import org.scalatest._
import flatspec._

class RemoveEveryOtherSpec extends AnyFlatSpec {

  val tests = List(
    (List("Hello", "Goodbye", "Hello Again"), List("Hello", "Hello Again")),
    (List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), List(1, 3, 5, 7, 9)),
    (List(List(1, 2)), List(List(1, 2))),
    (List(List("Goodbye"), Map("Great" -> "Job")), List(List("Goodbye")))
  )

  tests.foreach {
    case (input, expected) =>
      s"removeEveryOther($input)" should s"return $expected" in {
        assertResult(expected) {removeEveryOther(input)}
      }
  }
}
