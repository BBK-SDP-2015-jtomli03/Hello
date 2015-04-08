package week2coursera

/**
 * Created by Jo on 08/04/2015.
 */
class HigherOrderFunctions {

  //a tail-recursive version of sum
  def sum(f: Int => Int, a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if(a > b) acc
      else loop(a + 1, f(a) + acc)
    }
    loop(a, 0)
  }
}
