object CF262B extends App {

  import java.io.{PrintWriter}
  import java.util.{Locale, Scanner}

  val in = new Scanner(System.in)
  val out = new PrintWriter(System.out)

  def nextInt = in.nextInt
  def nextDouble = in.nextDouble
  def nextString = in.next

  def solve = {
    var n = nextInt
    var k = nextInt

    var a = (for (i <- 0 until n) yield nextInt).toArray

    var kk = 0
    var i = 0
    var j = 0
    while (kk < k && i < n) {
      if (a(i) < 0) {
        a(i) *= -1
        kk += 1
        j = i + 1
      }
      i += 1
    }

    if (kk < k && (k - kk) % 2 != 0) {
      if (j == 0) {
        a(j) *= -1
      } else if (j == n || a(j - 1) < a(j)) {
        a(j - 1) *= -1
      } else {
        a(j) *= -1
      }
    }

    out.println(a.reduceLeft[Int](_+_))
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