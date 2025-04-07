import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int S = Integer.parseInt(input[1]);
        int P = Integer.parseInt(input[2]);

        if (N == 0) {
            System.out.println(1);
            return;
        }

        String[] scoreStr = reader.readLine().split(" ");
        int[] score = new int[N];
        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(scoreStr[i]);
        }

        int rank = 1;
        for (int i = 0; i < N; i++) {
            if (S < score[i]) {
                rank++;
            } else {
                break;
            }
        }

        if (rank > P || (N == P && S <= score[N - 1])) {
            System.out.println(-1);
        } else {
            System.out.println(rank);
        }
    }
}
