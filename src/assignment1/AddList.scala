package assignment1

import scala.annotation.tailrec

/**
 * Created by Jo on 08/04/2015.
 */
class AddList {

  def addList(list: List[Int]): Int = {
    @tailrec
    def addListTailRec(acc: Int, myList: List[Int]): Int = {
      myList match{
        case List() => acc
        case head :: tail => addListTailRec(acc + head, tail)
      }
    }
    addListTailRec(0, list)
  }
}
