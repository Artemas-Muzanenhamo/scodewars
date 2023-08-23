package com.artemas.codewars.fundamentals.kyu8

def updateLight(current: String): String = current match
  case "green" => "yellow"
  case "yellow" => "red"
  case _ => "green"
