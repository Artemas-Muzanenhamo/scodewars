package com.artemas.codewars.fundamentals.kyu8

def howMuchILoveYou(petals: Int) = {
  petals % 6 match {
    case 1 => "I love you"
    case 2 => "a little"
    case 3 => "a lot"
    case 4 => "passionately"
    case 5 => "madly"
    case _ => "not at all"
  }
}