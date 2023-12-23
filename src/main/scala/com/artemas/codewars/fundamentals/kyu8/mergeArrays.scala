package com.artemas.codewars.fundamentals.kyu8

def mergeArrays(xs: Seq[Int], ys: Seq[Int]) = (xs ++ ys).distinct.sorted
