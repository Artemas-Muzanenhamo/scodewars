package com.artemas.codewars.fundamentals.kyu8

def mergeSeqs(xs: Seq[Int], ys: Seq[Int]): Seq[Int] = xs.++(ys).distinct.sorted