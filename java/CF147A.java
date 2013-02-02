import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CF147A {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer tokenizer;

    void solve() throws IOException {
        int n = nextInt();

        int c = 0;
        int seq = 1;

        String prev = "";
        for (int i = 0; i < n; i++) {

            String curr = nextToken() + " " + nextToken();

            if (curr.equals(prev)) {
                seq++;
            } else {
                seq = 1;
            }

            if (seq > c) {
                c++;
            }

            prev = curr;
        }

        out.write(String.valueOf(c));
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
        new CF147A().solve();
    }
}
