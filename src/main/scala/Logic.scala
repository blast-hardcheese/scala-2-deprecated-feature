package help

class Container[I <: Abstraction](val I: I) {
  /*
   * A case class capable of storing a reference to some `Member`, where type alignment is enforced by consumers
   */
  case class Data(value: I.Member)
}

/*
 * A class defining a collection of functions that all share the same `Abstraction`, able to accept parameterized
 * case classes, as well as return types constrained by the top-level type parameter (`I`)
 */
abstract class Logic[I <: Abstraction](val I: I, val C: Container[I]) {
  def build(value: I.Member): C.Data
  def func(data: C.Data): I.Member
}
