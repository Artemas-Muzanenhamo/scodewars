package com.artemas.codewars.fundamentals.kyu8

import org.scalatest._
import flatspec._
import matchers.should._

class DnaStrandTest extends AnyFlatSpec with Matchers {
  "DNAStrand(\"AAAA\")" should "return TTTT" in {
    DnaStrand.makeComplement("AAAA") shouldBe "TTTT"
  }
  "DNAStrand(\"ATTGC\")" should "return TAACG" in {
    DnaStrand.makeComplement("ATTGC") shouldBe "TAACG"
  }
  "DNAStrand(\"GTAT\")" should "return CATA" in {
    DnaStrand.makeComplement("GTAT") shouldBe "CATA"
  }
}
