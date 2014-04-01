
object FileMatcher {

  private def filesHere = (new java.io.File(".")).listFiles
  private def filesMatching(matcher: String => Boolean) =
    for (file <- filesHere; if matcher(file.getName)) yield file

  // (fileName: String, query: String) => fileName.endsWith(query)
  def filesEnding(query: String) =
    filesMatching(_.endsWith(query))
    //filesMatching(query, _.endsWith(_))

  def filesContaining(query: String) =
    filesMatching(_.contains(query))

  def filesRegex(query: String) =
    filesMatching(_.matches(query))
}
