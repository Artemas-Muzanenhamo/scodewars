package com.artemas.codewars.fundamentals.kyu6

def likes(names: Array[String]): String = {
  names match
    case Array(n) => s"$n likes this"
    case Array(n, m) => s"$n and $m like this"
    case Array(n, m, o) => s"$n, $m and $o like this"
    case Array(n, m, op*)  => s"$n, $m and ${op.size} others like this"
    case _ => "no one likes this"
}
