package com.linbo.algs4s.scalabyexample.Expression


/**
  * Created by Linbo on 4/10/16.
  */
object SqrtByNewton {

  def sqrt(x: Double): Double = {

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      Math.abs(guess * guess - x) / x < 0.001

    def improve(guess: Double): Double =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }

}
