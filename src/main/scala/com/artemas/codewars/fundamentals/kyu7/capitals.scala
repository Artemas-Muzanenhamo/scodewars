package com.artemas.codewars.fundamentals.kyu7

def capitals(word: String): Seq[Int] = word.zipWithIndex.filter(_._1.isUpper).map(_._2)
