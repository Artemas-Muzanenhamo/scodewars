package com.artemas.codewars.fundamentals.kyu8

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class RecognitionTestsSpec extends AnyFlatSpec with Matchers {
  "\"L0ND0N\"" should "return \"LONDON\"" in {
    Recognition.correct("L0ND0N") should be ("LONDON")
  }
  "\"DUBL1N\"" should "return \"DUBLIN\"" in {
    Recognition.correct("DUBL1N") should be ("DUBLIN")
  }
  "\"51NGAP0RE\"" should "return \"SINGAPORE\"" in {
    Recognition.correct("51NGAP0RE") should be ("SINGAPORE")
  }
  "\"BUDAPE5T\"" should "return \"BUDAPEST\"" in {
    Recognition.correct("BUDAPE5T") should be ("BUDAPEST")
  }
  "\"PAR15\"" should "return \"PARIS\"" in {
    Recognition.correct("PAR15") should be ("PARIS")
  }
}