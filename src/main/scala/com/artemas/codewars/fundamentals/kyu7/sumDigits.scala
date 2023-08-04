package com.artemas.codewars.fundamentals.kyu7

def sumDigits(n: Int): Int = n.abs.toString.map(_.asDigit).sum
