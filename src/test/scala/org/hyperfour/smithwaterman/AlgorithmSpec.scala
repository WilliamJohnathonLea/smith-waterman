package org.hyperfour.smithwaterman

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

@RunWith(classOf[JUnitRunner])
class AlgorithmSpec extends FlatSpec with Matchers {

  "generateMatrix" should "create a score matrix with a width (+1) and height (+1) matching the string lengths" in {
    val scoreMatrix = Algorithm.generateMatrix("CGG", "CCC")

    scoreMatrix.length shouldBe 4
    scoreMatrix.head.length shouldBe 4
  }

  it should "initialize the values to 0" in {
    val scoreMatrix = Algorithm.generateMatrix("CGG", "CCC")
    scoreMatrix.forall (_.forall(_ == 0)) shouldBe true
  }

  "applyScore" should "give a cell a score of 5 if the letters match" in {
    val str1 = "C"
    val str2 = "C"
    Algorithm.applyScore(str1, str2) shouldBe 5
  }

  it should "give a cell a score of -1 if the letters don't match" in {
    val str1 = "C"
    val str2 = "G"
    Algorithm.applyScore(str1, str2) shouldBe -1
  }

  it should "give a cell a score of 10 if the previous applied score is 5" in {
    val str1 = "C"
    val str2 = "C"
    Algorithm.applyScore(str1, str2, 5) shouldBe 10
  }

  it should "give a cell a score of -2 if the previous applied score is -1" in {
    val str1 = "C"
    val str2 = "G"
    Algorithm.applyScore(str1, str2, -1) shouldBe -2
  }

}
