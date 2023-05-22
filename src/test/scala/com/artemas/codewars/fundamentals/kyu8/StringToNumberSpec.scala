package com.artemas.codewars.fundamentals.kyu8

import org.scalatest.flatspec.AnyFlatSpec

class StringToNumberSpec extends AnyFlatSpec {
  "stringToNumber" should "pass basic tests" in {
    assertResult(1234, "\nInput\n  s = \"1234\"") (stringToNumber("1234"))
    assertResult(605, "\nInput\n  s = \"605\"") (stringToNumber("605"))
    assertResult(1405, "\nInput\n  s = \"1405\"") (stringToNumber("1405"))
    assertResult(-7, "\nInput\n  s = \"-7\"") (stringToNumber("-7"))
  }
}