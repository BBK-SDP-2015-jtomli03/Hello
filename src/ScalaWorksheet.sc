
import assignment1.{AddList, CountingChange, ParenthesesBalancing, PascalsTriangle}
import demo.Hello
import week2coursera.HigherOrderFunctions

val hello = new Hello
println(hello.sayHello("Scala"))
//pascals triangle
val triangle = new PascalsTriangle
triangle.printPascal
//parentheses balancing
val sentance = new ParenthesesBalancing
sentance.balance("just(an example)(".toList)
sentance.balance("just)(an example)".toList)
val coins = List(1,2,5)
val countChange = new CountingChange
println(countChange.countChange(4, coins))

val addList = new AddList
val myListAdded = addList.addList(coins)

val sumMe = new HigherOrderFunctions
sumMe.sum(x => x * x, 3, 5)