import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder result = new StringBuilder();
        long[] P = new long[101];
        P[1] = 1;
        P[2] = 1;
        P[3] = 1;
        P[4] = 2;
        P[5] = 2;
        for (int i = 6; i <= 100; i++) {
            P[i] = P[i-1] + P[i-5];
        }

        int T = Integer.parseInt(reader.readLine());
        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(reader.readLine());
            result.append(P[num]).append('\n');
        }
        System.out.println(result);
    }
}
