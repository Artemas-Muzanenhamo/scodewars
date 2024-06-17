package com.artemas.codewars.fundamentals.kyu7

object Vaporcode {

  def encode(s: String): String =
    s.replaceAll(" ", "").toUpperCase.mkString("", "  ", "")
}
