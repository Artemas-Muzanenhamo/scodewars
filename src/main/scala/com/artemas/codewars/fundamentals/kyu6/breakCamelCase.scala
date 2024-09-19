package com.artemas.codewars.fundamentals.kyu6

def breakCamelCase(s: String): String = s.toCharArray.map(value => if value.isUpper then s" $value" else s"$value").mkString.stripLeading()
