package com.artemas.codewars.fundamentals.kyu8

import org.scalatest._
import flatspec._
import matchers.should._

class IsUpperCaseTest extends AnyFlatSpec with Matchers {
  "isUpperCase(\"c\")" should "return false" in {
    isUpperCase("c") shouldBe false
  }
  "isUpperCase(\"C\")" should "return true" in {
    isUpperCase("C") shouldBe true
  }
  "isUpperCase(\"hello I AM DONALD\")" should "return false" in {
    isUpperCase("hello I AM DONALD") shouldBe false
  }
  "isUpperCase(\"HELLO I AM DONALD\")" should "return true" in {
    isUpperCase("HELLO I AM DONALD") shouldBe true
  }
  "isUpperCase(\"$%&\")" should "return true" in {
    isUpperCase("$%&") shouldBe true
  }
}