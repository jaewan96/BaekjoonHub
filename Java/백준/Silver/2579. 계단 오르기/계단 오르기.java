import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        int[] stair = new int[N + 1];
        for (int i = 1; i < N+1; i++) {
            stair[i] = Integer.parseInt(reader.readLine());
        }

        int result = 0;
        if (N < 3) {
            for (int i = 1; i <= N; i++) {
                result += stair[i];
            }
        } else if (N == 3) {
            result = Math.max(stair[1] + stair[3], stair[2] + stair[3]);
        } else {
            int[] dp = new int[N + 1];
            dp[1] = stair[1];
            dp[2] = stair[1] + stair[2];
            dp[3] = Math.max(stair[1] + stair[3], stair[2] + stair[3]);

            for (int i = 4; i <= N; i++) {
                dp[i] = Math.max(dp[i - 3] + stair[i] + stair[i - 1], dp[i - 2] + stair[i]);
            }
            result = dp[N];
        }

        System.out.println(result);
    }
}
