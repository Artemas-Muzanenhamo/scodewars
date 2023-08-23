package com.artemas.codewars.fundamentals.kyu6

object Walk {
  def isValidWalk(walk: Seq[Char]): Boolean = {
    if (walk.length != 10) {
      false
    } else {
      val directionsCount = walk.groupBy(identity).mapValues(_.size)
      directionsCount.getOrElse('n', 0) == directionsCount.getOrElse('s', 0) &&
        directionsCount.getOrElse('e', 0) == directionsCount.getOrElse('w', 0)
    }
  }
}