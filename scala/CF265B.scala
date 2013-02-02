object CF265B extends App {

  import java.io.{PrintWriter}
  import java.util.{Locale, Scanner}

  val in = new Scanner(System.in)
  val out = new PrintWriter(System.out)

  def nextInt = in.nextInt
  def nextDouble = in.nextDouble
  def nextString = in.next

  def solve = {
    var n = nextInt
    var h = (for (i <- 0 until n) yield nextInt).toArray

    var c = 0
    var t = -1
    for (i <- 0 until n) {
      t += math.abs(h(i) - c) + 2;
      c = h(i)
    }

    out.println(t)
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