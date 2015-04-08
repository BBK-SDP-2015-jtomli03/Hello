package assignment1

/**
 * Created by Jo on 06/04/2015.
 */
class PascalsTriangle {

  //pascal(0,2)=1 ie 0 is columns down and 2 is row along
  //rows and columns start with 0
  def pascal(c: Int, r: Int): Int = {
    (c, r) match {
      case (c, r) if c == 0 || c == r => 1
      case (c, r) => pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
  }

  def printPascal = {
    for(row <- 0 to 10){
      for(col <- 0 to row)
        print(pascal(col,row) + " ")
      println()
    }
  }
}
