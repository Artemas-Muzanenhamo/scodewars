package com.artemas.codewars.fundamentals.kyu8

class MergeSeqsSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "mergeSeqs" should "pass basic tests" in {
    val testCases = Seq[(Seq[Int], Seq[Int], Seq[Int])](
      (Seq(1, 3, 5), Seq(2, 4, 6), Seq(1, 2, 3, 4, 5, 6)),
      (Seq(2, 4, 8), Seq(2, 4, 6), Seq(2, 4, 6, 8))
    )

    testCases foreach {
      (xs, ys, expected) =>
        assertResult(expected, s"\nInputs\n xs = $xs\n ys = $ys")(mergeSeqs(xs, ys))
    }
  }
}