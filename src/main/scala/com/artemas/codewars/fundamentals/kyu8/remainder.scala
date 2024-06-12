package com.artemas.codewars.fundamentals.kyu8

def remainder(a: Int, b: Int): Option[Int] = if a > b then
  if b != 0 then Option(a % b) else None
else
  if a != 0 then Option(b % a) else None