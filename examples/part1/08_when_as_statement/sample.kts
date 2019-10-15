fun process(input: Any) {
  when(input) {
    1 -> println("one")      
    in 13..19 -> println("got a teen")
    is String -> println("got a string")
    else -> println("whatever")
  }
}

process(1)
process(14)
process("hello")