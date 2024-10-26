import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        StringTokenizer st = new StringTokenizer(input);
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int cnt = 0;
        boolean result = false;
        for (int i = 1; i < N+1; i++) {
            if (N % i == 0) {
                cnt++;
                if (cnt == K) {
                    System.out.print(i);
                    result = true;
                    break;
                }
            }
        }
        if (!result) {
            System.out.print(0);
        }
    }
}