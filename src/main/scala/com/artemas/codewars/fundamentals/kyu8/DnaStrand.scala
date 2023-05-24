package com.artemas.codewars.fundamentals.kyu8

object DnaStrand {

  def makeComplement(dna: String): String = dna.map {
    case 'A' => 'T'
    case 'C' => 'G'
    case 'G' => 'C'
    case 'T' => 'A'
  }
}
