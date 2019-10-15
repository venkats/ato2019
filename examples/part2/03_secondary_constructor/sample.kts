class Car(val year: Int, var dist: Int, var color: String) {
  constructor(year: Int, dist: Int) : this(year, dist, "blue") {}
}

val car = Car(2019, 0, "red")

println(car.year)
println(car.dist)
println(car.color)

val car2 = Car(2019, 0)
println(car2.color)