package com.artemas.codewars.fundamentals.kyu8

class UsdToCnySpec extends org.scalatest.flatspec.AnyFlatSpec {
  "usdToCny" should "pass basic tests" in {
    assert(usdToCny(0) == "0.00 Chinese Yuan", "for usdToCny(0)")
    assert(usdToCny(15) == "101.25 Chinese Yuan", "for usdToCny(15)")
    assert(usdToCny(465) == "3138.75 Chinese Yuan", "for usdToCny(465)")
  }
}