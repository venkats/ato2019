class Car(val year: Int, var dist: Int)

val car = Car(2019, 0)

println(car.year)
println(car.dist)

//car.year = 2020 /ERROR

car.dist = 10
println(car.dist)

//year is a read-only property
//dist is a read/write property