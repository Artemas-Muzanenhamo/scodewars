package com.artemas.codewars.fundamentals.kyu8

def addLength(s: String): Seq[String] = s.split(" ").map(s => s"$s ${s.length}")
