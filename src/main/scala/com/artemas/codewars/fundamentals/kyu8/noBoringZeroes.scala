package com.artemas.codewars.fundamentals.kyu8

def noBoringZeroes(n: Int): Int = n.toString.replaceAll("0+$", "").toIntOption.getOrElse(0)