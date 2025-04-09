import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        String[] input = reader.readLine().split(" ");
        int[] budget = new int[N];
        for (int i = 0; i < N; i++) {
            budget[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(budget);
        int M = Integer.parseInt(reader.readLine());
        int result = 0;

        int s = 0;
        int e = budget[N-1];
        int mid = 0;
        while (s <= e) {
            mid = (e + s) / 2;
            long total = 0;

            for (int b : budget) {
                total += Math.min(mid, b);
            }

            if (total > M) {
                e = mid - 1;
            } else {
                result = mid;
                s = mid + 1;
            }
        }
        System.out.println(result);
    }
}
