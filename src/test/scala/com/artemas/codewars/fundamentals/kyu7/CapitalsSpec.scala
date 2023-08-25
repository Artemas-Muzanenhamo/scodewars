package com.artemas.codewars.fundamentals.kyu7

class CapitalsSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "capitals" should "pass basic tests" in {
    assertResult(Seq(0, 3, 4, 6), "\nInput:\n  word = \"CodEWaRs\"")(capitals("CodEWaRs"))
  }
}