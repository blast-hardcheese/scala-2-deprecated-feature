Hello! Thank you in advance for taking a look.

Short summary, this repo contains a minimal representation of an encoding used heavily in [guardrail](https://github.com/guardrail-dev/guardrail) (known as `LanguageAbstraction` in that repository).

There are three `crossScalaVersion`'s defined, the code compiles in 2.12, 2.13, but not 3.x.

I would like to find an alternate encoding that is compatible with the new restrictions brought on by Dotty, that maintains the ability to type-parameterize data classes.
