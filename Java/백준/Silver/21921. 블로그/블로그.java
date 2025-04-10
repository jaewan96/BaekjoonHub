import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);

        String[] visitor = reader.readLine().split(" ");
        int[] visit = new int[N];
        for (int i = 0; i < N; i++) {
            visit[i] = Integer.parseInt(visitor[i]);
        }
        int[] dp = new int[N - X+1];
        int num = 0;
        for (int i = 0; i < X; i++) {
            num += visit[i];
        }
        dp[0] = num;
        for (int i = 1; i <= N - X; i++) {
            dp[i] = dp[i - 1] - visit[i - 1] + visit[i + X-1];
        }

        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= N - X; i++) {
            if (dp[i] > max) {
                max = dp[i];
            }
            map.put(dp[i], map.getOrDefault(dp[i], 0) + 1);
        }
        if (max == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(max);
            System.out.println(map.get(max));
        }
    }
}
