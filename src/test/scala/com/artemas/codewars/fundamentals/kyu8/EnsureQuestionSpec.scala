package com.artemas.codewars.fundamentals.kyu8

class EnsureQuestionSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "ensureQuestion" should "pass basic tests" in {
    assert(ensureQuestion("") == "?", "for ensureQuestion(\"\")")
    assert(ensureQuestion("Yes") == "Yes?", "for ensureQuestion(\"Yes\")")
    assert(ensureQuestion("No?") == "No?", "for ensureQuestion(\"No?\")")
    assert(ensureQuestion("Well????") == "Well????", "for ensureQuestion(\"Well????\")")
    assert(ensureQuestion("A question? No") == "A question? No?", "for ensureQuestion(\"A question? No\")")
  }
}