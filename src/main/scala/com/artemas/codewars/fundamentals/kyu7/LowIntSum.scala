package com.artemas.codewars.fundamentals.kyu7

object LowIntSum {

//  def sumTwoSmallest(numbers: List[Int]): Int = numbers.sorted.slice(0, 2).sum
  def sumTwoSmallest(numbers: List[Int]): Int = numbers.sorted.take(2).sum
}
