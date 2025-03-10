package u02a

object Prova extends App:

  println("Hello, scala")

  def positive(x: Int): String = x match
    case x if x >= 0 =>  "positive"
    case _ => "negative"

    println(positive(-1))

  val posFunction: Int => String = x => x match
    case x if x >= 0 =>  "positive"
    case _ => "negative"

    println(positive(-1))

  def neg(p: String => Boolean): (String => Boolean) =
    s => !p(s)
  println(neg(s => true)("hello"))

  def genericNeg[X](p: X => Boolean): (X => Boolean) =
    s => !p(s)
  println(genericNeg(s => false)(5))

  def curriedFunType(x: Int)(y: Int)(z: Int): Boolean =
    x <= y && y == z
  println(curriedFunType(2)(3)(3))

  val p1: Int => (Int => (Int => Boolean)) =
    x <= y && y == z
  println(curriedFunType(2)(3)(3))