package com.artemas.codewars.fundamentals.kyu6

import org.scalatest._
import flatspec._
import matchers.should._

class AlphabetPositionTest extends AnyFlatSpec with Matchers {
  "alphabetPosition(\"The sunset sets at twelve o' clock.\")" should "return \"20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11\"" in {
    AlphabetPosition.alphabetPosition("The sunset sets at twelve o' clock.")  shouldBe "20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11"
  }
  "alphabetPosition(\"The narwhal bacons at midnight.\")" should "return \"20 8 5 14 1 18 23 8 1 12 2 1 3 15 14 19 1 20 13 9 4 14 9 7 8 20\"" in {
    AlphabetPosition.alphabetPosition("The narwhal bacons at midnight.")  shouldBe "20 8 5 14 1 18 23 8 1 12 2 1 3 15 14 19 1 20 13 9 4 14 9 7 8 20"
  }
  "alphabetPosition(\"Test\")" should "return \"20 8 5 14 1 18 23 8 1 12 2 1 3 15 14 19 1 20 13 9 4 14 9 7 8 20\"" in {
    AlphabetPosition.alphabetPosition("`amgqZgipAuzog|shk/rbZwtlnejixf7dycYHdLav")  shouldBe "1 13 7 17 26 7 9 16 1 21 26 15 7 19 8 11 18 2 26 23 20 12 14 5 10 9 24 6 4 25 3 25 8 4 12 1 22"
  }
  "alphabetPosition(\"Test2\")" should "return \"20 8 5 14 1 18 23 8 1 12 2 1 3 15 14 19 1 20 13 9 4 14 9 7 8 20\"" in {
    AlphabetPosition.alphabetPosition("zthdalr_s,!f{qgsmx-Toibuncopfbdr#v.j/et'ywk+")  shouldBe "26 20 8 4 1 12 18 19 6 17 7 19 13 24 20 15 9 2 21 14 3 15 16 6 2 4 18 22 10 5 20 25 23 11"
  }
}