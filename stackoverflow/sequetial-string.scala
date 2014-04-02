
//It like a 26*26 matrix for every 2 char combination

def scan(start:String, end:String) = {

  val row_start                 = start.toCharArray.head
  val row_end                   = end.toCharArray.head
  val column_start_of_first_row = start.toCharArray.last
  val column_end_of_last_row    = end.toCharArray.last

  val printRow =
    (current_row:String, current_row_start_col:Char, current_row_end_col:Char) =>
      (current_row_start_col to current_row_end_col).map( current_row + _ )

  (row_start to row_end).map { current_row_char=>
      current_row_char match {
        case `row_start` => printRow(current_row_char.toString, column_start_of_first_row, 'z')
        case `row_end`   => printRow(current_row_char.toString, 'a'                      , column_end_of_last_row)
        case _           => printRow(current_row_char.toString, 'a'                      , 'z')
      }
  }.reduce(_ ++: _)

}

println( scan(args(0), args(1)) )
