package help

object Main extends App {
  def createLogic = new Logic[Instance] {
    def build(value: String): Data[Instance] = Data[Instance](value)
    def func(data: Data[Instance]): String = data.value
  }

  val logic1 = createLogic
  val logic2 = createLogic

  assert(logic2.func(logic1.build("Hello, world!")) == "Hello, world!")
}
