val numbers = listOf(1, 2, 3, 4)

fun isEven(n: Int): Boolean {
  println("isEven called for $n")
  return n % 2 == 0
}
               
println(numbers
  .filter { e -> isEven(e) }
  .map { e -> e * 2 }
  .first())
  
println("--------------")
println(numbers
  .asSequence()
  .filter { e -> isEven(e) }
  .map { e -> e * 2 }
  .first())  