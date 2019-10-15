fun process(input: Any) = 
  when(input) {
    1 -> "one"
    in 13..19 -> "got a teen"
    is String -> "got a string"
    else -> "whatever"
  }

println(process(1))
println(process(14))
println(process("hello"))