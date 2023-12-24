package com.artemas.codewars.fundamentals.kyu8

//def stringClean(s: String): String = s.replaceAll("\\d", "")
def stringClean(s: String): String = s.filterNot(_.isDigit)
