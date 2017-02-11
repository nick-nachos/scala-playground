package com.nachos.scala

import com.nachos.scala.math.{MyMath, Rational}

object MainModule {

  def main(args: Array[String]): Unit = {
    println("Hello world!")
    val r1 = Rational(1, 2)
    val r2 = Rational(2, 6)
    println(s"r1 = $r1")
    println(s"r2 = $r2")
    println(s"-r1 = ${-r1}")
    println(s"-r2 = ${-r2}")
    println(s"r1 + r2 = ${r1 + r2}")
    println(s"r1 - r2 = ${r1 - r2}")
    println(s"r1 * r2 = ${r1 * r2}")
    println(s"r1 / r2 = ${r1 / r2}")
  }

}
