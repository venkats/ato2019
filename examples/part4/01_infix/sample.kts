class Pizza {
  infix fun spread(topping: String): Pizza {
    println("spread $topping")
    return this
  }
}

//val pizza = Pizza()
//pizza.spread("cheese")
//pizza.spread("olives")

val pizza = Pizza()
pizza spread "cheese" spread "olives"