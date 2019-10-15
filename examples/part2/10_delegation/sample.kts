interface Worker {
  fun work()
  fun vacation()
}

class Programmer : Worker {
  override fun work() = println("...code...")
  override fun vacation() = println("...code at the beach...")
}

class Manager(val victim: Programmer) : Worker by victim {
  override fun vacation() = println("... all year long ...")
}
  
val bob = Manager(Programmer())
bob.work()
bob.vacation()