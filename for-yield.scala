
def fileLines(file: java.io.File) = scala.io.Source.fromFile(file).getLines.toList

val filesHere = (new java.io.File(".")).listFiles

val forLineLengths =
  for {
    file <- filesHere
    if file.getName.endsWith(".java")
    line <- fileLines(file)
    trimmed = line.trim
    if line.trim.matches(".* for .*")
  } yield trimmed.length


for (ttt <- forLineLengths) println(ttt)
