package com.artemas.codewars.fundamentals.kyu8

object Recognition {
  def correct(s: String): String = s map { case '5' => 'S' case '0' => 'O' case '1' => 'I' case everythingElse => everythingElse}
}
