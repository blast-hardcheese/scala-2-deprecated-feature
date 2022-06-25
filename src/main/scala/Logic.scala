package help

/*
 * A case class capable of storing a reference to some `Member`, where type alignment is enforced by consumers
 */
case class Data[A, M](value: M)(implicit abstraction: Abstraction.Aux[A, M])
case class Data2[A, M](a: A, value: M)(implicit abstraction: Abstraction.Aux[A, M])
class Container[A, M](a: A)(implicit abstraction: Abstraction.Aux[A, M]) {
  case class Data(value: M)
}

/*
 * A class defining a collection of functions that all share the same `Abstraction`, able to accept parameterized
 * case classes, as well as return types constrained by the top-level type parameter (`I`)
 */
abstract class Logic[A] {
  type Member

  def abstraction: Abstraction.Aux[A, Member]

  def build(value: Member): Data[A, Member]
  def func(data: Data[A, Member]): Member
}

object Logic {
  type Aux[A, M] = Logic[A] { type Member = M }
}
