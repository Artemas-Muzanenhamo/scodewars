package com.artemas.codewars.fundamentals.kyu7

import org.scalatest._
import flatspec._
import matchers.should._

class AddBinaryTest extends AnyFlatSpec with Matchers {
  "addBinary(1, 1)" should "return \"10\"" in {
    addBinary(1, 1) shouldBe "10"
  }
  "addBinary(0, 1)" should "return \"1\"" in {
    addBinary(0, 1) shouldBe "1"
  }
  "addBinary(1, 0)" should "return \"1\"" in {
    addBinary(1, 0) shouldBe "1"
  }
  "addBinary(2, 2)" should "return \"100\"" in {
    addBinary(2, 2) shouldBe "100"
  }
  "addBinary(51, 12)" should "return \"111111\"" in {
    addBinary(51, 12) shouldBe "111111"
  }
}