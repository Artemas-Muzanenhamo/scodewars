package com.artemas.codewars.fundamentals.kyu6

object AlphabetPosition {

  def alphabetPosition(text: String): String = {
    val regex = "\\s|\\W|\\d|_"
    text.replaceAll(regex, "").toUpperCase.map(Alphabet.getLetterNumber).mkString("", " ", "")
  }

//  def alphabetPosition(text: String): String =
//    text.filter(_.isLetter).map(_.toLower - 96).mkString(" ")
  
  private object Alphabet {
    def getLetterNumber(value: Char): Int = value match {
      case 'A' => 1
      case 'B' => 2
      case 'C' => 3
      case 'D' => 4
      case 'E' => 5
      case 'F' => 6
      case 'G' => 7
      case 'H' => 8
      case 'I' => 9
      case 'J' => 10
      case 'K' => 11
      case 'L' => 12
      case 'M' => 13
      case 'N' => 14
      case 'O' => 15
      case 'P' => 16
      case 'Q' => 17
      case 'R' => 18
      case 'S' => 19
      case 'T' => 20
      case 'U' => 21
      case 'V' => 22
      case 'W' => 23
      case 'X' => 24
      case 'Y' => 25
      case 'Z' => 26
    }
  }
}