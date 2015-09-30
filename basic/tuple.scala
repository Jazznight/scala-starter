
val tupleObj = "the quick brown fox jumps over the lazy dog".split("\\s+").map(str => (str, 1))

for (i <- tupleObj) 
  println(i._1,i._2)
