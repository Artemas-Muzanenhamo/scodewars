package com.artemas.codewars.fundamentals.kyu6

object FindTheOddInt {
  def findOdd(xs: Seq[Int]): Int = {
    xs.find(x => xs.count(_ == x) % 2 == 1).get
  }
}