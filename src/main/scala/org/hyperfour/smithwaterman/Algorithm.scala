package org.hyperfour.smithwaterman

/**
  * Created by william on 16/07/16.
  */
object Algorithm {

  private val gapPenalty = -2
  private val matchScore = 5
  private val mismatchScore = -1

  /*
   * If calculated max value comes from above cell or left cell then apply gap penalty
   * Else use calculated max value
   */

  def generateMatrix(str1: String, str2: String): Array[Array[Int]] = {
    Array.fill(str1.length +1)(Array.fill(str2.length +1)(0))
  }

}
