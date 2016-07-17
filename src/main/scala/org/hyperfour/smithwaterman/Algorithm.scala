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

  def generateMatrix(str1: String, str2: String): Seq[Seq[Int]] = {
    Seq.fill(str1.length +1)(Seq.fill(str2.length +1)(0))
  }

//  def calculateScore(matrix: Seq[Seq[Int]], str1: String, str2: String): Seq[Seq[String]] = {
//    val normStr1 = "0" + str1
//    val normStr2 = "0" + str2
//    Seq.empty
//  }

  def applyScore(str1: String, str2: String, prev: Int = 0): Int = {
    if(str1.equals(str2)) prev + matchScore
    else prev + mismatchScore
  }

}
