val greet = "hello"

fun String.shout() = toUpperCase()

println(greet)

println(greet.shout())

println(greet::class)
println(greet.javaClass)