package com.linbo.algs4s.scalabyexample.Expression

import org.scalatest.FunSpec
import org.scalatest.Matchers._

/**
  * Created by Linbo on 4/10/16.
  */
class SqrtByNewtonSpec extends FunSpec {
  val expected = 1.0 +- 0.001

  describe("SqrtByNewton") {
    it("should calculate square root for normal numbers") {
       SqrtByNewton.sqrt(0.0001) / 0.01 should be (expected)
       SqrtByNewton.sqrt(4) / 2 should be (expected)
    }

    it("should calculate square root for small numbers") {
      SqrtByNewton.sqrt(0.1e-20) / Math.sqrt(0.1e-20) should be (expected)
      SqrtByNewton.sqrt(1e-6) / Math.sqrt(1e-6) should be (expected)
    }

    it("should calculate square root for large numbers") {
      SqrtByNewton.sqrt(1.0e20) / Math.sqrt(1.0e20) should be (expected)
      SqrtByNewton.sqrt(1.0e50) / Math.sqrt(1.0e50) should be (expected)
      SqrtByNewton.sqrt(0.1e-20) / Math.sqrt(0.1e-20) should be (expected)
    }
  }

}