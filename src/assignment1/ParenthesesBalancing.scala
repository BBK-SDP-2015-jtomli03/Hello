package assignment1

import scala.annotation.tailrec

/**
 * Created by Jo on 06/04/2015.
 */
class ParenthesesBalancing {

  def balance(chars: List[Char]): Boolean = {
    @tailrec
    def balanceAcc(chars: List[Char], balance: Int): Boolean = {
      chars match {
        case Nil => balance == 0 //ie returns boolean true if balanced and false if not
        case (c :: tail) if c == '(' => balanceAcc(tail, balance +1)
        case (c :: tail) if c == ')' =>
          if(balance > 0) balanceAcc(tail, balance - 1)
          else false
        case _ => balanceAcc(chars.tail, balance)
      }
    }
    balanceAcc(chars, 0)
  }
}
