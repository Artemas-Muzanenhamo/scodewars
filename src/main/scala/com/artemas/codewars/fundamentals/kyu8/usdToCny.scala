package com.artemas.codewars.fundamentals.kyu8

import java.math.MathContext

def usdToCny(usd: Int): String = BigDecimal(usd * 6.75).setScale(2).toString().mkString("", "", " Chinese Yuan")
