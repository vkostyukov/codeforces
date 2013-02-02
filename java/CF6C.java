import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.StringTokenizer;

public class CF6C implements Runnable {

    Locale L = Locale.US; 
    StringTokenizer tokenizer;
    BufferedReader in;
    PrintWriter out;

    public static void main(String[] args) {
        new Thread(new CF6C()).start();
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
        int t[] = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = nextInt();
        }

        int a = 0;
        int b = 0;
        int i = 0; 
        int j = n - 1;
        while (j - i > 1) {
            int d = t[i] - t[j];
            if (d < 0) {
                t[i] = 0;
                t[j] = Math.abs(d);
                a += 1;
                i += 1;
            } else if (d == 0) {
                t[i] = t[j] = 0;
                a += 1;
                b += 1;
                i += 1;
                j -= 1;
            } else {
                t[j] = 0;
                t[i] = Math.abs(d);
                b += 1;
                j -= 1;
            }
        }

        if (i == j) {
            a += 1;
        } else {
            a += 1;
            b += 1;
        }

        out.println(a + " " + b);
    }
}
