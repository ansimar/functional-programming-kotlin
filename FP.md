FUNCTIONAL PROGRAMMING & KOTLIN
===============================

CHAPTER 1: WHAT IS FUNCTIONAL PROGRAMMING
-----------------------------------------
It's not the language what makes a language functional. It's the way you write your code.

There are languages more functional-friendly than others.

Imperative <-> Functional  (Opposed styles)

Imperative -> Elements DO
Functional -> Elements ARE

FP -> NO SIDE EFFECTS, as opposite in Imperative
THROWING an EXCEPTION is a SIDE EFFECT

Referential Transparency makes programs safer
Referential Transparency -> Code that doesn't mutate or depend on the external world.
  Pros:
    * It's self-contained: it doesn't depend on any external device.
    * It's deterministic: always return the same value for the same argument.
    * Never throw any kind of Exception.
    * It won't mutate arguments or external data.
    * It won't hang because some external device.

Benefits of FP
  * Easier to reason because they are deterministic. One specific input return always same output.
  * FP programs are easier to test -> because they don't have side effect, you don't need mocks.
  * FP programs are more modular because they are built from functions.
  * Composition and recombination is much more easier.

FP programs are THREAD-SAFE because they avoid the mutation of shared state.

Substitution model to reason about programs
  3x2 + 4x5 = 26
  6   + 4x5 = 26
  6   + 20  = 26

  Classes
  -------
    Classes in Kotlin are declared using the keyword class:
      class Invoice {
      }
      A class in Kotlin can have a primary constructor and one or more secondary constructors. The primary constructor is part of the class header: it goes after the class name (and optional type parameters).
      class Person constructor(firstName: String) {
      }
      or
      class Person(firstName: String) {
      }
      The primary constructor cannot contain any code. Initialization code can be placed in initializer blocks, which are prefixed with the init keyword.

    Creating instances of classes
      To create an instance of a class, we call the constructor as if it were a regular function:
      val invoice = Invoice()
      val customer = Customer("Joe Smith")

    Properties
     These can be declared as mutable, using the var keyword or read-only using the val keyword.

We often need classes to hold two or more values, because functional programming replaces side effects returning a representation of these effects.

  Generics
  --------
  As in Java, classes in Kotlin may have type parameters:

  class Box<T>(t: T) {
      var value = t
  }
  In general, to create an instance of such a class, we need to provide the type arguments:

  val box: Box<Int> = Box<Int>(1)

First-class functions = simply functions than can be used as arguments for other functions

Benefits:
    - Functional programming is programming with functions, returning values and having no side effects.
    - Functional programs are easy to reason about and easy to deterministic
    - Functional programming offers a high level of abstraction and reusability
    - Functional programs are more robust that imperatives.
    - Functional programs are safer in multithreading environments because they avoid shared mutable state

CHAPTER 2: WHAT IS A FUNCTION
-----------------------------
Function is a relation between an source set (function domain) to a target set (function codomain).

To be a FUNCTION all elements of the domains MUST have one and only one corresponding in the codomain.
