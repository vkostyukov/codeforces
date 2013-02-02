import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.StringTokenizer;

public class CF165A implements Runnable {

    Locale L = Locale.US; 
	StringTokenizer tokenizer;
    BufferedReader in;
    PrintWriter out;

    public static void main(String[] args) {
        new Thread(new CF165A()).start();
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

        for (int i = 0; i < n; i++) {
            int a = nextInt();
            boolean yes = false; 
            for (int j = 3; !yes && j <= 360; j++) {
                if (j * a == 180 * (j - 2)) {
                    yes = true;
                }
            }
            if (yes) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        
        
        // out.println(answ);
    }
}
