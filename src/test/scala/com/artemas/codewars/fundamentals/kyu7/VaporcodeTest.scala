package com.artemas.codewars.fundamentals.kyu7

import org.scalatest._
import flatspec._

class VaporcodeTest extends AnyFlatSpec {
  it should "pass sample tests" in {
    val testCases = List( //(s, expected)
      ("Lets go to the movies", "L  E  T  S  G  O  T  O  T  H  E  M  O  V  I  E  S"),
      ("Why isn't my code working?", "W  H  Y  I  S  N  '  T  M  Y  C  O  D  E  W  O  R  K  I  N  G  ?")
    )

    testCases.foreach {
      case (s, expected) => assertResult(expected, s"\nInput:\n  s = $s") {Vaporcode.encode(s)}
    }
  }
}