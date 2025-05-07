import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(reader.readLine());

            int[] lst = new int[N];
            String[] input = reader.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                lst[j] = Integer.parseInt(input[j]);

            }

            long profit = 0;
            int max = 0;
            for (int j = N-1; j >= 0; j--) {
                if (lst[j] > max) {
                    max = lst[j];
                } else {
                    profit += max - lst[j];
                }
            }

            result.append(profit).append("\n");
        }
        System.out.println(result);
    }
}
