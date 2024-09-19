package com.artemas.codewars.fundamentals.kyu6

class BreakCamelCaseSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "breakCamelCase" should "pass basic tests" in {
    assert(breakCamelCase("helloWorld") == "hello World", "for breakCamelCase(\"helloWorld\")")
    assert(breakCamelCase("helloworld") == "helloworld", "for breakCamelCase(\"helloWorld\")")
    assert(breakCamelCase("camelCase") == "camel Case", "for breakCamelCase(\"camelCase\")")
    assert(breakCamelCase("CamelCase") == "Camel Case", "for breakCamelCase(\"CamelCase\")")
    assert(breakCamelCase("breakCamelCase") == "break Camel Case", "for breakCamelCase(\"breakCamelCase\")")
  }
}
