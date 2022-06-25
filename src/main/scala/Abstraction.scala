package help

/*
 * A type bag, holding many unfilled type references
 */
trait Abstraction[A] {
  type Member
}

object Abstraction {
  type Aux[A, M] = Abstraction[A] { type Member = M }
}
