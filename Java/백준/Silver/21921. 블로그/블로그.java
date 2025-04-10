import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);

        String[] inputVisit = reader.readLine().split(" ");
        int[] visit = new int[N];
        for (int i = 0; i < N; i++) {
            visit[i] = Integer.parseInt(inputVisit[i]);
        }

        int sum = 0;
        for (int i = 0; i < X; i++) {
            sum += visit[i];
        }

        int max = sum;
        int cnt = 1;
        for (int i = 1; i < N - X + 1; i++) {
            sum += visit[i + X - 1] - visit[i - 1];
            if (sum > max) {
                max = sum;
                cnt = 1;
            } else if (sum == max) {
                cnt ++;
            }
        }
        if (max == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(max);
            System.out.println(cnt);
        }
    }
}
