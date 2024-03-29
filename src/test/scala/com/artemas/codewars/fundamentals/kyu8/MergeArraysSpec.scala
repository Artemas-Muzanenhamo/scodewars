package com.artemas.codewars.fundamentals.kyu8

class MergeArraysSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "mergeArrays" should "pass basic tests" in {
    assert(mergeArrays(Seq(1,2,3,4), Seq(5,6,7,8)) == Seq(1,2,3,4,5,6,7,8), "for mergeArrays(Seq(1,2,3,4), Seq(5,6,7,8))")
    assert(mergeArrays(Seq(10,8,6,4,2), Seq(9,7,5,3,1)) == Seq(1,2,3,4,5,6,7,8,9,10), "for mergeArrays(Seq(10,8,6,4,2), Seq(9,7,5,3,1))")
    assert(mergeArrays(Seq(-20,35,36,37,39,40), Seq(-10,-5,0,6,7,8,9,10,25,38,50,62)) == Seq(-20,-10,-5,0,6,7,8,9,10,25,35,36,37,38,39,40,50,62), "for mergeArrays(Seq(-20,35,36,37,39,40), Seq(-10,-5,0,6,7,8,9,10,25,38,50,62))")
    assert(mergeArrays(Seq(5,6,7,8,9,10), Seq(20,18,15,14,13,12,11,4,3,2)) == Seq(2,3,4,5,6,7,8,9,10,11,12,13,14,15,18,20), "for mergeArrays(Seq(5,6,7,8,9,10), Seq(20,18,15,14,13,12,11,4,3,2))")
    assert(mergeArrays(Seq(45,30,20,15,12,5), Seq(9,10,18,25,35,50)) == Seq(5,9,10,12,15,18,20,25,30,35,45,50), "for mergeArrays(45,30,20,15,12,5), Seq(9,10,18,25,35,50))")
    assert(mergeArrays(Seq(-8,-3,-2,4,5,6,7,15,42,90,134), Seq(216,102,74,32,8,2,0,-9,-13)) == Seq(-13,-9,-8,-3,-2,0,2,4,5,6,7,8,15,32,42,74,90,102,134,216), "for mergeArrays(Seq(-8,-3,-2,4,5,6,7,15,42,90,134), Seq(216,102,74,32,8,2,0,-9,-13))")
    assert(mergeArrays(Seq(-100,-27,-8,5,23,56,124,325), Seq(-34,-27,6,12,25,56,213,325,601)) == Seq(-100,-34,-27,-8,5,6,12,23,25,56,124,213,325,601), "for mergeArrays(Seq(-100,-27,-8,5,23,56,124,325), Seq(-34,-27,6,12,25,56,213,325,601))")
    assert(mergeArrays(Seq(18,7,2,0,-22,-46,-103,-293), Seq(-300,-293,-46,-31,-5,0,18,19,74,231)) == Seq(-300,-293,-103,-46,-31,-22,-5,0,2,7,18,19,74,231), "for mergeArrays(Seq(18,7,2,0,-22,-46,-103,-293), Seq(-300,-293,-46,-31,-5,0,18,19,74,231))")
    assert(mergeArrays(Seq(105,73,-4,-73,-201), Seq(-201,-73,-4,73,105)) == Seq(-201,-73,-4,73,105), "for mergeArrays(Seq(105,73,-4,-73,-201), Seq(-201,-73,-4,73,105))")
  }
}