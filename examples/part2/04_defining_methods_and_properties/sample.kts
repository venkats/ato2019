class Car(val year: Int, var dist: Int, var color: String) {
  var fuelLevel: Int = 100
    private set
  
  fun drive(distance: Int) {
    fuelLevel--
    dist += distance
  }
}

val car = Car(2019, 0, "red")

car.drive(10)
println(car.dist)
println(car.fuelLevel)
//car.fuelLevel = 50 //ERROR
