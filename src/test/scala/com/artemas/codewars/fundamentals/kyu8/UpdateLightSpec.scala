package com.artemas.codewars.fundamentals.kyu8

import org.scalatest._
import flatspec._

class UpdateLightSpec extends AnyFlatSpec {
  it should "pass basic tests" in {
    assertResult("yellow", "\nInput: current = \"yellow\"") {updateLight("green")}
    assertResult("red", "\nInput: current = \"red\"") {updateLight("yellow")}
    assertResult("green", "\nInput: current = \"green\"") {updateLight("red")}
  }
}