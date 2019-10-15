val target = (Math.random() * 100).toInt()

fun guess(attempts: Int = 1) {
  print("Your guess:")
  System.out.flush()
  val input = readLine()?.toInt() ?: -1
  
  when {
    input < target -> println("Aim higher")
    input > target -> println("Aim lower")
    input == target -> println("You got it in $attempts attempt(s)")
  }                                       
  
  if(input != target) {
    guess(attempts + 1)
  }
}

println("I've guessed a number between 0 and 100, can you find it?")       

guess()