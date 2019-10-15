fun call(greet: String.(String) -> String) =
 "Hello".greet("Jane")
 
println(call { name -> "$this $name" }) 