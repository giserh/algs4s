package com.linbo.algs4s

import org.scalatest.FunSpec
import org.scalatest.Matchers._

class ExampleSpec extends FunSpec {
  describe("Example") {
    it("shuold add two integers correctly") {
      Example.add(1, 3) should be (4)
    }
  }
}
