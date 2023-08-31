package com.artemas.codewars.fundamentals.kyu7

def filterList(list: List[Any]): List[Int] = list.collect { case value: Int => value }
