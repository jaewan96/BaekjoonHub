import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] len = reader.readLine().split(" ");
        int H = Integer.parseInt(len[0]);
        int W = Integer.parseInt(len[1]);

        String[] input = reader.readLine().split(" ");
        int[] wall = new int[W];
        for (int i = 0; i < W; i++) {
            wall[i] = Integer.parseInt(input[i]);
        }

        int[] rightWall = new int[W];
        int[] leftWall = new int[W];

        int leftMax = 0;
        int rightMax = 0;
        for (int i = 0; i < W; i++) {
            if (leftMax < wall[i]) {
                leftMax = wall[i];
            }
            leftWall[i] = leftMax;

            if (rightMax < wall[W - 1 - i]) {
                rightMax = wall[W - 1 - i];
            }
            rightWall[W-1-i] = rightMax;
        }

        int result = 0;
        for (int i = 0; i < W; i++) {
            result += Math.min(rightWall[i], leftWall[i]) - wall[i];
        }

        System.out.println(result);
    }
}
