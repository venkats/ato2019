class Car private constructor(val year: Int) {
  companion object {
    fun create(year: Int) = Car(year)
  }
}

var car = Car.create(2019)

println(car.year)