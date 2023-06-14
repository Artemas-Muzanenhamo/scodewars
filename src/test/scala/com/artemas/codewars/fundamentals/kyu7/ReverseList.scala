package com.artemas.codewars.fundamentals.kyu7

import org.scalatest._
import flatspec._
import matchers.should._

class ReverseList extends AnyFlatSpec with Matchers {
  "reverseList(List[Int]())" should "return List[Int]()" in {
    reverseList(List[Int]()) shouldBe List[Int]()
  }
  "reverseList(List(1, 2, 3, 4))" should "return List(4, 3, 2, 1)" in {
    reverseList(List(1, 2, 3, 4)) shouldBe List(4, 3, 2, 1)
  }
  "reverseList(List(2, 4, 5, 6))" should "return List(6, 5, 4, 2)" in {
    reverseList(List(2, 4, 5, 6)) shouldBe List(6, 5, 4, 2)
  }
}
