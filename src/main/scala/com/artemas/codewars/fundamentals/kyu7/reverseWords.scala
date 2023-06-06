package com.artemas.codewars.fundamentals.kyu7

//def reverseWords(text: String): String = text.split(" ").map(string => string.reverse).mkString(" ")
def reverseWords(text: String): String = text.split(" ").map(_.reverse).mkString(" ")
