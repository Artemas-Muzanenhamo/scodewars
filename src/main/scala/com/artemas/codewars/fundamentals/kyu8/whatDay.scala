package com.artemas.codewars.fundamentals.kyu8

def whatDay(num: Int): String = num match
  case 1 => "Sunday"
  case 2 => "Monday"
  case 3 => "Tuesday"
  case 4 => "Wednesday"
  case 5 => "Thursday"
  case 6 => "Friday"
  case 7 => "Saturday"
  case _ => "Wrong, please enter a number between 1 and 7"