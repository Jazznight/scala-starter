/*
 * A partial function is a function that is valid for
 * only a subset of values of those types
 * you might pass in to it.
 *
 */

def sum(x:Int, y:Int) = x+y

val a=sum _
val sum5=sum(_:Int,5)


println(a(1,2))
println(sum5(2))
