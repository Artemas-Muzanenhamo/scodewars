package com.artemas.codewars.fundamentals.kyu6

import org.scalatest._
import flatspec._
import matchers.should._

import Walk._

class ValidWalkSuite extends AnyFlatSpec with Matchers {

  val validWalks = Seq(
    Seq('n','s','n','s','n','s','n','s','n','s'),
  )

  val invalidWalks = Seq(
    Seq('w','e','w','e','w','e','w','e','w','e','w','e'),
    Seq('w'),
    Seq('n','n','n','s','n','s','n','s','n','s')
  )

  validWalks.foreach { valid =>
    s"isValidWalk($valid)" should "return true" in {
      assert(isValidWalk(valid) == true)
    }
  }

  invalidWalks.foreach { invalid =>
    s"isValidWalk($invalid)" should "return false" in {
      assert(isValidWalk(invalid) == false)
    }
  }
}