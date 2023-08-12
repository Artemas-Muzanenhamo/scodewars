package com.artemas.codewars.fundamentals.kyu8

//def findMultiples(n: Int, limit: Int): List[Int] = Range(n, limit + 1).filter(_ % n == 0).toList
def findMultiples(n: Int, limit: Int): List[Int] = (n to limit by n).toList
