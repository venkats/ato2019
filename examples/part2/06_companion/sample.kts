class Car private constructor(val year: Int) {
  companion object CarFactory {
    fun create(year: Int) = Car(year)
  }
}

var car = Car.CarFactory.create(2019)

println(car.year)