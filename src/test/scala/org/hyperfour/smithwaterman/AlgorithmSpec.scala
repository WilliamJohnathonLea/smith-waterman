package org.hyperfour.smithwaterman

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

@RunWith(classOf[JUnitRunner])
class AlgorithmSpec extends FlatSpec with Matchers {

  "generateMatrix" should "create a score matrix with a width (+1) and height (+1) matching the string lengths" in {
    val scoreMatrix = Algorithm.generateMatrix("CGG", "CCC")

    scoreMatrix.length shouldBe 4
    scoreMatrix(0).length shouldBe 4
  }

  it should "initialize the values to 0" in {
    val scoreMatrix = Algorithm.generateMatrix("CGG", "CCC")
    scoreMatrix.forall { el =>
      el.forall(_ == 0)
    } shouldBe true
  }

}
