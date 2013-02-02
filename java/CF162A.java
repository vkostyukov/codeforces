import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CF162A implements Runnable {

    StringTokenizer tokenizer;
    BufferedReader in;
    PrintWriter out;

    public static void main(String[] args) {
        new Thread(new CF162A()).start();
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

        if (n == 0 || n == 1 || n == 2) {
            out.println(-1);
            return;
        }

        out.print(n - 1 + " ");
        out.print(n + " ");
        for (int i = 1; i < n - 1; i++) {
            out.print(i + " ");
        }
        out.println();
    }
}
