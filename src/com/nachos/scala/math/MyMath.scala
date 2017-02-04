package com.nachos.scala.math

object MyMath {

  def gcd(a: Int, b: Int): Int = {
    if (b == 0) Math.abs(a) else gcd(b, a % b)
  }

}
