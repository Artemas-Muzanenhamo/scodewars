package com.artemas.codewars.fundamentals.kyu7

def binSeqToInt(xs: Seq[Int]): Int = {
  Integer.parseInt(xs.mkString, 2)
}
