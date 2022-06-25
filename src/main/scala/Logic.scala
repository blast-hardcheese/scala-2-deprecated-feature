package help

/*
 * A case class capable of storing a reference to some `Member`, where type alignment is enforced by consumers
 */
case class Data[I <: Abstraction](value: I#Member)
// Importantly, the following will not compile:
//     case class Data[I <: Abstraction](I: I)(value: I.Member)
// and this one can never be satisfied:
//   class Container[I <: Abstraction](I: I) {
//     case class Data(value: I.Member)
//   }

/*
 * A class defining a collection of functions that all share the same `Abstraction`, able to accept parameterized
 * case classes, as well as return types constrained by the top-level type parameter (`I`)
 */
abstract class Logic[I <: Abstraction] {
  def build(value: I#Member): Data[I]
  def func(data: Data[I]): I#Member
}
