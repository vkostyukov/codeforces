object CF260C extends App {

  import java.io.{PrintWriter}
  import java.util.{Locale, Scanner}

  val in = new Scanner(System.in)
  val out = new PrintWriter(System.out)

  def nextInt = in.nextInt
  def nextLong = in.nextLong
  def nextDouble = in.nextDouble
  def nextString = in.next

  def solve = {
    val n = nextInt
    val x = nextInt - 1
    var a = (for (i <- 0 until n) yield nextLong).toArray

    var c = 0l
    var min = a.min
    if (min > 0) {
      a = a map { _ - min }
      c = min * n
    }

    var finished = false
    var i = x
    while (!finished) {
      if (a(i) == 0) {
        finished = true
        a(i) = c
      } else {
        a(i) -= 1
        c += 1
        i = if (i == 0) n - 1 else i - 1
      }
    }

    a foreach((x) => out.print(x + " "))
    out.println()
  }

  try { 
    solve 
  } catch {
    case _: Exception => sys.exit(9999)
  } finally {
    out.flush
    out.close
  }
}