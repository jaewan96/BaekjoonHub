import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        int[][] arr = new int[N][2];

        int max = 0;
        for (int i = 0; i < N; i++) {
            String[] input = reader.readLine().split(" ");
            int L = Integer.parseInt(input[0]);
            int H = Integer.parseInt(input[1]);

            arr[i][0] = L;
            arr[i][1] = H;

            if (H > max) {
                max = H;
            }
        }

        Arrays.sort(arr, (o1, o2) -> {
            return o1[0] - o2[0];
        });

        int leftMax = -1;
        int rightMax = -1;
        for (int i = 0; i < N; i++) {
            if (arr[i][1] == max) {
                if (leftMax == -1) {
                    leftMax = i;
                }
                rightMax = i;
            }
        }

        int sum = 0;
        int height = arr[0][1];
        for (int i = 1; i <= leftMax; i++) {
            sum += (arr[i][0] - arr[i - 1][0]) * height;
            if (arr[i][1] > height) {
                height = arr[i][1];
            }
        }

        height = arr[N-1][1];
        for (int i = N - 1; i > rightMax; i--) {
                sum += (arr[i][0] - arr[i-1][0]) * height;
            if (arr[i - 1][1] > height) {
                height = arr[i-1][1];
            }
        }

        sum += (arr[rightMax][0] - arr[leftMax][0] + 1) * max;
        System.out.println(sum);
    }
}
