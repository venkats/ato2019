class Car(val year: Int, var dist: Int, var color: String) {
  var fuelLevel: Int = 100
    get() = field
    set(value: Int) {
      if(value < 0) {
        throw RuntimeException("setting to negative eh? We will come burn your village")
      }
      
      field = value
    }
  
  fun drive(distance: Int) {
    fuelLevel--
    dist += distance
  }
}

val car = Car(2019, 0, "red")
println(car.fuelLevel)
car.fuelLevel = 50
println(car.fuelLevel)

car.fuelLevel = -20