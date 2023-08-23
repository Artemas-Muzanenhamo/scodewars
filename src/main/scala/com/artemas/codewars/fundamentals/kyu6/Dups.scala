package com.artemas.codewars.fundamentals.kyu6

object Dups {

  def duplicateCount(str: String): Int = {
//    str.toLowerCase.groupBy(identity).values.count(_.length > 1)
    str.groupBy(_.toLower).count(_._2.size > 1)
  }
}
