package com.artemas.codewars.fundamentals.kyu8

object SimpleMultiplication {

  def multiply(n: Int): Int = if (n % 2 == 0) n * 8 else n * 9 
}