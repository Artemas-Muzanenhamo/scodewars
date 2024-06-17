package com.artemas.codewars.fundamentals.kyu8

def ensureQuestion(s: String): String = if (s.endsWith("?")) s else s"$s?"
