package com.linbo.algs4s

import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

object StringSpecification extends Properties("String") {

  property("startsWith") = forAll { (a: String, b: String) =>
      (a+b).startsWith(a)
    }

}
