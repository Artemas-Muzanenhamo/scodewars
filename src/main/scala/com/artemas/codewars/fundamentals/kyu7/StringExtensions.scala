package com.artemas.codewars.fundamentals.kyu7

implicit class StringExtensions(s: String) {
  def toJadenCase = s.toLowerCase.split(" ").map(_.capitalize).mkString(" ")
}
