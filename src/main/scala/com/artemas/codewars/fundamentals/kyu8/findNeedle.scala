package com.artemas.codewars.fundamentals.kyu8

//def findNeedle(haystack: List[String]): String = {
//  val value: List[(String, Int)] = haystack.zipWithIndex.filter(_._1.contains("needle"))
//  s"found the needle at position ${value.head._2}"
//}
def findNeedle(haystack: List[String]): String = "found the needle at position " + haystack.indexOf("needle").toString