package com.artemas.codewars.fundamentals.kyu8

def quadrant(x: Int, y: Int): Int =
  (x < 0, y < 0) match
    case (false, false) => 1
    case (true, false) => 2
    case (true, true) => 3
    case (false, true) => 4
//  if x >= 0 && y >= 0 then 1
//  else if x < 0 && y >= 0 then 2
//  else if x < 0 && y < 0 then 3
//  else 4
