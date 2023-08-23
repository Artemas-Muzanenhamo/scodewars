package com.artemas.codewars.fundamentals.kyu7

import java.math.BigInteger

def eliminateUnsetBits(number: String): Long = if (number.toFloat == 0) 0 else new BigInteger(number.replaceAll("0", ""), 2).longValue()
