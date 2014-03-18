val numbers = List(-11,-10,-5,0,5,10)

print("DUMMY")
numbers.foreach( (x: Int) => print(", " + x) )

print("\nDUMMY")
val ft = numbers.filter( _ > 0 )
ft.foreach( x => print(", " + x) )

print("\n")
