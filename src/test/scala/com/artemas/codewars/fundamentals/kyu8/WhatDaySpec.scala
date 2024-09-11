package com.artemas.codewars.fundamentals.kyu8

class WhatDaySpec extends org.scalatest.flatspec.AnyFlatSpec {
  "whatDay" should "pass basic tests" in {
    assert(whatDay(1) == "Sunday", "for whatDay(1)")
    assert(whatDay(2) == "Monday", "for whatDay(2)")
    assert(whatDay(3) == "Tuesday", "for whatDay(3)")
    assert(whatDay(4) == "Wednesday", "for whatDay(4)")
    assert(whatDay(5) == "Thursday", "for whatDay(5)")
    assert(whatDay(6) == "Friday", "for whatDay(6)")
    assert(whatDay(7) == "Saturday", "for whatDay(7)")
    assert(whatDay(0) == "Wrong, please enter a number between 1 and 7", "for whatDay(0)")
    assert(whatDay(8) == "Wrong, please enter a number between 1 and 7", "for whatDay(8)")
    assert(whatDay(20) == "Wrong, please enter a number between 1 and 7", "for whatDay(20)")
  }
}