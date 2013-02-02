import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF161B implements Runnable {

    StringTokenizer tokenizer;
    BufferedReader in;
    PrintWriter out;

    public static void main(String[] args) {
        new CF161B().run();
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

    double nextDouble() throws NumberFormatException, IOException {
        return Double.parseDouble(nextToken());
    }

    String nextString() throws IOException {
        return nextToken();
    }
 
    void solve() throws NumberFormatException, IOException {

        int n = nextInt();
        int k = nextInt();

        if (n == k) {
            out.println("0 0");
            return;
        }

        if (k == 0) {
            out.println("100 100");
            return;
        }

        if (k > n) {
            out.println("-1");
            return;
        }

        int q[] = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = nextInt();
        }

        Arrays.sort(q);

        int diff = q[n - k] - q[n - k - 1];
        if (diff >= 1) {
            out.println(q[n - k] + " " + q[n - k]);
        } else {
            out.println("-1");
        }
    }
}
