import java.io._

def twice(op: Double => Double, x: Double) = op(op(x))

println(twice(_+2, 5))

def withPrintWriter(file: File, op: PrintWriter => Unit) {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
}

def withCarryPrintWriter(file: File)(op: PrintWriter => Unit) {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
}

withPrintWriter(
    new File("/tmp/date.txt"),
    _.println(new java.util.Date)
    //writer => writer.println(new java.util.Date)
)

withCarryPrintWriter(new File("/tmp/dateCarry.txt")) { writer =>
  writer.println(new java.util.Date)
}
