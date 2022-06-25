package help

object Main extends App {
  val I = new Instance
  val Co = new Container(I)

  def createLogic = new Logic(I, Co) {
    def build(value: String): C.Data = C.Data(value)
    def func(data: C.Data): String = data.value
  }

  val logic1 = createLogic
  val logic2 = createLogic

  // Does not compile due to
  //
  //   [error]  found   : help.Main.logic1.C.Data
  //   [error]  required: help.Main.logic2.C.Data
  //
  // despite the underlying instance of C being bound by the same `Instance`
  assert(logic2.func(logic1.build("Hello, world!")) == "Hello, world!")
}
