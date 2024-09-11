package com.artemas.codewars.fundamentals.kyu7

object ExesAndOhs {
  def xo(str: String): Boolean = str.toLowerCase.count(_ == 'x') == str.toLowerCase.count(_ == 'o')
}