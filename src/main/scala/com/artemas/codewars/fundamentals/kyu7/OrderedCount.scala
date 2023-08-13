package com.artemas.codewars.fundamentals.kyu7

object OrderedCount {
// Solution A

//  def orderedCount(chars: String): List[(Char, Int)] = {
//    var map = Map[Char, Int]()
//
//    val array = chars.toCharArray
//    for (character <- array) {
//      if (map.contains(character)) {
//        val existingCount = map.getOrElse(character, 0)
//        val updatedCount = existingCount + 1
//        map = map.updated(character, updatedCount)
//      } else {
//        map = map.updated(character, 1)
//      }
//    }
//
//    val sortedList = map.toList.sortBy { case (char, _) =>
//      chars.indexOf(char)
//    }
//
//    sortedList
//  }

// Solution B

//  def orderedCount(chars: String): List[(Char, Int)] = {
//    val charCounts = chars.groupBy(identity).view.mapValues(_.length).toList
//    charCounts.sortBy { case (char, _) =>
//      chars.indexOf(char)
//    }
//  }

  def orderedCount(chars: String): List[(Char, Int)] = {
    chars.distinct.map(c => (c, chars.count(_ == c))).toList
  }
}
