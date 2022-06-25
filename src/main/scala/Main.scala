package help

object Main extends App {
  def createLogic: Logic.Aux[Instance, String] = new Logic[Instance] {
    override final type Member = String

    override def abstraction: Abstraction.Aux[Instance, String] = new Abstraction[Instance] {
      override final type Member = String
    }

    override def build(value: String): Data[Instance, String] = Data[Instance, String](value)
    override def func(data: Data[Instance, String]): String = data.value
  }

  val logic1 = createLogic
  val logic2 = createLogic

  assert(logic2.func(logic1.build("Hello, world!")) == "Hello, world!")
}
