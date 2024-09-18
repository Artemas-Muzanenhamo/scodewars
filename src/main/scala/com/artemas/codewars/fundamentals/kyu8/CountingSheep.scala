package com.artemas.codewars.fundamentals.kyu8

object CountingSheep {
  def countingSheep(num: Int): String = (1 to num).map((i: Int) => s"$i sheep...").mkString
}