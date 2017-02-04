package com.nachos.scala.math

class Rational private (numerator: Int, denominator: Int) {

  require(denominator != 0, "Denominator cannot be zero.")
  private val _numerator = numerator
  private val _denominator = denominator

  def unary_+ = this

  def unary_- = Rational(-this._numerator, this._denominator)

  def +(other: Rational): Rational = {
    val numerator = this._numerator * other._denominator + other._numerator * this._denominator
    val denominator = this._denominator * other._denominator
    Rational(numerator, denominator)
  }

  def -(other: Rational): Rational = this + (-other)

  def *(other: Rational): Rational = {
    val numerator = this._numerator * other._numerator
    val denominator = this._denominator * other._denominator
    Rational(numerator, denominator)
  }

  def /(other: Rational): Rational = this * Rational(other._denominator, other._numerator)

  override def toString: String = s"${this._numerator} / ${this._denominator}"

}

object Rational {

  def apply(numerator: Int, denominator: Int): Rational = {
    val g = gcd(numerator, denominator)
    new Rational(numerator / g, denominator / g)
  }

  def apply(num: Int): Rational = apply(num, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) 0 else MyMath.gcd(a, b)

}
