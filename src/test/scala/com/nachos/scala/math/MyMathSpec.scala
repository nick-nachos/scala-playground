package com.nachos.scala.math

import org.scalatest._

class MyMathSpec extends FlatSpec {

  "GCD of zero and any positive number" should  "be that number" in {
    for (i <- 1 to 100) {
      assertResult(i)(MyMath.gcd(i, 0))
    }
  }

  "GCD of zero and any negative number" should  "be that number's positive" in {
    for (i <- -100 to -1) {
      assertResult(Math.abs(i))(MyMath.gcd(i, 0))
    }
  }

}
