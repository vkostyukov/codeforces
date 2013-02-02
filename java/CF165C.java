import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.StringTokenizer;

public class CF165C implements Runnable {

    Locale L = Locale.US; 
	StringTokenizer tokenizer;
    BufferedReader in;
    PrintWriter out;

    public static void main(String[] args) {
        new Thread(new CF165C()).start();
    }

    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            solve();
        } catch (Exception e) {
            System.exit(9000);
        } finally {
            out.flush();
            out.close();
        }
    }

    String nextToken() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(in.readLine());
        }
        return tokenizer.nextToken();
    }

    int nextInt() throws NumberFormatException, IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws NumberFormatException, IOException {
    	return Long.parseLong(nextToken());
    }

    double nextDouble() throws NumberFormatException, IOException {
        return Double.parseDouble(nextToken());
    }

    String nextString() throws IOException {
        return nextToken();
    }
 
    void solve() throws NumberFormatException, IOException {
        int n = nextInt();

        long p = 0;
        for (int i = 0; i < n; i++) {
            int k = nextInt();
            int a = nextInt();

            long q = k + 1;
            long pack = 4;

            while (pack < a) {
                q += 1;
                pack *= 4;
            }

            p = Math.max(p, q);
        }

        out.println(p);
    }
}
