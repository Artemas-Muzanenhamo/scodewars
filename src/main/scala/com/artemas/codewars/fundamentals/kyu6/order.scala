package com.artemas.codewars.fundamentals.kyu6

//def order(str: String): String = str.split(" ")
//  .sortBy((str: String) => str.find((c: Char) => '1' == c || '2' == c || '3' == c || '4' == c || '5' == c || '6' == c || '7' == c || '8' == c || '9' == c))
//  .mkString("", " ", "")

def order(str: String): String = {
  val words = str.split(" ")
  val sortedWords = words.sortBy { word => word.filter(_.isDigit).toInt }
  sortedWords.mkString(" ")
}