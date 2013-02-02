import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CF164B {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer tokenizer;

    void solve() throws IOException {

        int n = nextInt();
        int p = 0;

        for (int i = 0; i < n; i++) {
            p += (n -i - 1) * (i + 1) + 1;
        }

        out.write(String.valueOf(p));
        out.flush();
    }

    int nextInt() throws IOException {
        return Integer.valueOf(nextToken());
    }

    String nextToken() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(in.readLine());
        }
        return tokenizer.nextToken();
    }

    public static void main(String args[]) throws IOException {
        new CF164B().solve();
    }
}
