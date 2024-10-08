package com.artemas.codewars.fundamentals.kyu6

import org.scalatest.*, funsuite.*, matchers.should.*, prop.*
import FindTheOddInt.findOdd

class FindTheOddIntSpec extends AnyFunSuite with TableDrivenPropertyChecks with Matchers {
  test("Fixed tests") {
    val fixedTests = Table[Seq[Int], Int](
      ("xs", "expected"),
      (List(20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5), 5),
      (List(1,1,2,-2,5,2,4,4,-1,-2,5), -1),
      (List(20,1,1,2,2,3,3,5,5,4,20,4,5), 5),
      (List(10), 10),
      (List(1,1,1,1,1,1,10,1,1,1,1), 10),
      (List(5,4,3,2,1,5,4,3,2,10,10), 1),
    )
    forAll(fixedTests) { findOdd(_) shouldBe _ }
  }
}
