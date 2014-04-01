
class Rational(n:Int, d:Int) {


  def this(n:Int) = this(n:Int, 1)  //Auxiliary constructor

  private val g = gcd(n.abs, d.abs)
  private def gcd(a:Int, b:Int):Int = if (b==0) a else gcd(b, a%b)
  val numer:Int = n/g
  val denom:Int = d/g

  override def toString = if(numer==denom) "1" else numer + "/" + denom

  def add(that:Rational) :Rational = new Rational(
    numer*that.denom + that.numer*denom,
    this.denom * that.denom
  )

  def *(that:Rational) : Rational = new Rational(
    numer*that.numer,
    this.denom*that.denom
  )

}

val r = args.length match {
  case 1 => new Rational(args(0).toInt)
  case 2 => new Rational(args(0).toInt,args(1).toInt)
}


println("r = " + r)
println("r + r = " + r.add(r))
println("r * r = " + r*r)
