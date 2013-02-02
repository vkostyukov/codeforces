object CF110A extends App {

  import java.io.{PrintWriter}
  import java.util.{Locale, Scanner}

  val in = new Scanner(System.in)
  val out = new PrintWriter(System.out)

  def nextInt = in.nextInt
  def nextDouble = in.nextDouble
  def nextString = in.next

  def solve = {
    val s: Seq[Char] = nextString
    var c = s.count((x) =>  x == '4' || x == '7')
    out.println(if (c == 4 || c == 7) "YES" else "NO")
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