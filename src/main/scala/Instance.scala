package help

/*
 * A subtype of Abstraction with all the members filled
 */
class Instance

object Instance {

  implicit def instanceAbstraction: Abstraction.Aux[Instance, String] = new Abstraction[Instance] {
    override final type Member = String
  }

}
