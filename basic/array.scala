val stringArr1 = new Array[String] (3)
stringArr1(0) = "first"
stringArr1(1) = "second"
stringArr1.update(2,"third")
for (i <- 0 to 2) println(stringArr1(i))


val stringArr2 = Array("Factory-first", "Factory-second", "Factory-third")
for (i <- 0 to 2) println(stringArr2.apply(i))
