package com.artemas.codewars.fundamentals.kyu8

def multiTable(n: Int): String = (1 to 10).map(i => s"$i * $n = ${i * n}").mkString("\n")
