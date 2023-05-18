package com.artemas.codewars.fundamentals.kyu8

import munit.Clue.generate
import org.scalatest.*
import flatspec.*
import org.scalatest.Assertions.assertResult

class DnaToRnaSpec extends munit.FunSuite {
  test("it should pass the basic test") {
    val testCases = List( //dna, expected
      ("", ""),
      ("TTTT", "UUUU"),
      ("GCAT", "GCAU"),
      ("GACCGCCGCC", "GACCGCCGCC")
    )

    testCases.foreach {
      case (dna, expected) => assertResult(expected, s"\nInput:\n  dna = \"$dna\"") {
        dnaToRna(dna)
      }
    }
  }
}
