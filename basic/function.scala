
def addOne(x:Int) = {x+1}
def addTwo(x:Int) = x+2
val addThree = (x:Int) => x+3

val sum = addOne(1) + addTwo(1) + addThree(1)
println(sum)



def addFour1(x:Int):Unit = x+4
def addFour2(x:Int) {x+4}
println("():Unit (with '=') => " + addFour1(1))
println("():Unit (without '=')=> " + addFour2(1))

def addFive(x:Int):Int  = x+5
println("():Int => " + addFive(1))
