package com.artemas.codewars.fundamentals.kyu7

object Factorial {
  def !(n: Int): BigInt = {
    n match
      case 0 => 1
      case _ => n * Factorial.!(n - 1)
  }

  // another easier elegant solution
  // def !(n: Int) = (BigInt(1) to n).product
}