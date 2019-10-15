class Robot {
  val left = "left"
  val right = "right"
  val fast = "fast"
  infix fun turns(dir: String) = println("turns $dir")
  infix fun runs(how: String) = println("runs $how")
}
infix fun operate(block: Robot.(Robot) -> Unit) {
  val robot = Robot()
  robot.block(robot)
}

operate {
  it turns left
  it turns right
  it runs fast
}