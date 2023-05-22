package com.artemas.codewars.fundamentals.kyu8

def stringToNumber(s: String): Int = s.toIntOption.getOrElse(0)