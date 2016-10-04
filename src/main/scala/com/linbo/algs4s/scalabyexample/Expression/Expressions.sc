/*  call-by-value, call-by-name and lazy evaluation
  *
  * scala> val callByValue = println("call by value")
  * call by value
  * callByValue: Unit = ()
  *
  * scala> callByValue
  *
  * scala> callByValue
  *
  * scala> def callByName = println("call by name")
  * callByName: Unit
  *
  * scala> callByName
  * call by name
  *
  * scala> callByName
  * call by name
  *
  * scala> lazy val lazyEvaluatioin = println("lazy evaluation")
  * lazyEvaluatioin: Unit = <lazy>
  *
  * scala> lazyEvaluatioin
  * lazy evaluation
  *
  * scala> lazyEvaluatioin
  *
  * scala>
*/

// Square Roots by Newton’s Method

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


sqrt(0.001)
sqrt(0.1e-20)
sqrt(1.0e20)
sqrt(1.0e50)
sqrt(1e-6)