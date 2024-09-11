package com.artemas.codewars.fundamentals.kyu7

def disemvowel(str: String): String = {
//  val vowels = "aeiouAEIOU".toSet
//  str.filterNot(vowels)
  str.replaceAll("[aeiouAEIOU]", "")
}