Hello! Thank you in advance for taking a look.

Short summary, this repo contains a minimal representation of an encoding used heavily in [guardrail](https://github.com/guardrail-dev/guardrail) (known as `LanguageAbstraction` in that repository).

There are three `crossScalaVersion`'s defined, the code compiles in 2.12, 2.13, but not 3.x.

I would like to find an alternate encoding that is compatible with the new restrictions brought on by Dotty, that maintains the ability to type-parameterize data classes.

There are four files:
- [`Abstraction.scala`](src/main/scala/Abstraction.scala), an abstract class with an unfilled type member
- [`Instance.scala`](src/main/scala/Instance.scala), a concrete class with that type member filled
- [`Logic.scala`](src/main/scala/Logic.scala), a case class and business logic class that both use type projections into `Abstraction`, with the assumption that at call site everything will line up
- [`Main.scala`](src/main/scala/Main.scala), using multiple instances of `Logic` that are able to interoperate, both in type-parameterized data classes as well as primitives.
