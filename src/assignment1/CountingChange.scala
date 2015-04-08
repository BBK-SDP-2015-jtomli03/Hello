package assignment1

/**
 * Created by Jo on 07/04/2015.
 */
class CountingChange {

//  def countChange(money: Int, coins: List[Int]): Int = {
//    def count(m: Int, c: List[Int]) : Int = {
//      if (c.isEmpty) 0
//      else if (m - c.head == 0) 1
//      else if (m - c.head < 0) 0
//      else countChange(m - c.head, c) + countChange(m, c.tail)
//    }
//    count(money, coins.sorted)
//  }

  def countChange(money: Int, coins: List[Int]): Int = {
    def count(m: Int, c: List[Int]) : Int = {
      c match{
        case _ if c.isEmpty => 0 //could also be case Nil => 0
        case _ if m - c.head == 0 => 1
        case _ if m - c.head < 0 => 0
        case _ => countChange(m - c.head, c) + countChange(m, c.tail)
      }
    }
    count(money, coins.sorted)
  }
}
