package com.artemas.codewars.fundamentals.kyu8

//def removeEveryOther[T](list: List[T]): List[T] = list.zipWithIndex
//  .filter { case (_, index) => (index) % 2 == 0 }
//  .map { case (element, _) => element }
def removeEveryOther[T](list: List[T]): List[T] = {
  list.grouped(2).map(_.head).toList
}
