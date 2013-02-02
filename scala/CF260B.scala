object CF260B extends App {

  import java.io.{PrintWriter}
  import java.util.{Locale, Scanner}

  val in = new Scanner(System.in)
  val out = new PrintWriter(System.out)

  def nextInt = in.nextInt
  def nextLong = in.nextLong
  def nextDouble = in.nextDouble
  def nextString = in.next

  def solve = {
    var s: Seq[Char] = nextString
    val n = s.length
    var r: Map[String, Int] = Map()

    for (i <- 0 until n - 9) {
      if (s(i).isDigit && s(i + 1).isDigit) {
        val d = ("" + s(i) + s(i + 1)).toInt
        if (s(i + 2) == '-') {
          if (s(i + 3).isDigit && s(i + 4).isDigit) {
            val m = ("" + s(i + 3) + s(i + 4)).toInt
            if (s(i + 5) == '-') {
              if (s(i + 6).isDigit && s(i + 7).isDigit && s(i + 8).isDigit && s(i + 9).isDigit) {
                val y = ("" + s(i + 6) + s(i + 7) + s(i + 8) + s(i + 9)).toInt
                var valid = false
                if (y >= 2013 && y <= 2015) {
                  if (m >= 1 && m <= 12) {
                    if (d >= 1 && d <= 31) {
                      valid = m match {
                        case 2 => (d <= 28)
                        case 4 | 6 | 9 | 11 => (d <= 30)
                        case _ => true
                      }
                    }
                  }
                }
                if (valid) {
                  val date = (for (j <- i until i + 10) yield s(j)).mkString
                  var counter = 1
                  if (r.contains(date)) {
                    counter = r(date) + 1
                  }
                  r += (date -> counter)
                }
              }
            }
          }
        }
      }
    }

    var c = 0
    var doomsday = "" 
    r.keys foreach { k =>
       if (r(k) > c) {
         c = r(k)
         doomsday = k
       }
    }

    out.println(doomsday)
  }

  try { 
    solve 
  } catch {
    case _: Exception =>  sys.exit(9999)
  } finally {
    out.flush
    out.close
  }
}