package com.artemas.codewars.fundamentals.kyu6

object Meeting {

  def meeting(s: String): String = {
    val upperCasedValue = s.toUpperCase
    val names: Array[String] = upperCasedValue.split(";")
    val seq = names.map(value => value.split(":")).toList
    val emailNames: Seq[Person] = seq.map(value => Person(name = value.head, surname = value.last))
    emailNames.foreach(println)
    ""
  }

  case class Person(val name: String, val surname: String)
}
