package com.artemas.codewars.fundamentals.kyu8

import org.scalatest.flatspec.AnyFlatSpec

class GooseFilterSpec extends AnyFlatSpec {
  "gooseFilter" should "pass basic tests" in {
    val testCases = List[(List[String], List[String])]( //birds, expected
      (List("Mallard", "Hook Bill", "African", "Crested", "Pilgrim", "Toulouse", "Blue Swedish"), List("Mallard", "Hook Bill", "Crested", "Blue Swedish")),
      (List("Mallard", "Barbary", "Hook Bill", "Blue Swedish", "Crested"), List("Mallard", "Barbary", "Hook Bill", "Blue Swedish", "Crested")),
      (List("African", "Roman Tufted", "Toulouse", "Pilgrim", "Steinbacher"), List())
    )

    testCases.foreach {
      case (birds, expected) => assertResult(expected, s"\nInput\n  birds = $birds") (gooseFilter(birds))
    }
  }
}