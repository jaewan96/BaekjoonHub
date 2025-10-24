import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        boolean[][] seat = new boolean[N+1][21];

        Set<String> train = new HashSet<>();

        for (int i = 0; i < M; i++) {
            String[] command = reader.readLine().split(" ");

            if (Integer.parseInt(command[0]) == 1) {
                int n = Integer.parseInt(command[1]);
                int position = Integer.parseInt(command[2]);

                seat[n][position] = true;
            } else if (Integer.parseInt(command[0]) == 2) {
                int n = Integer.parseInt(command[1]);
                int position = Integer.parseInt(command[2]);

                seat[n][position] = false;
            } else if (Integer.parseInt(command[0]) == 3) {
                int n = Integer.parseInt(command[1]);

                for (int j = 20; j >1; j--) {
                    seat[n][j] = seat[n][j - 1];
                }
                seat[n][1] = false;
            } else if ((Integer.parseInt(command[0]) == 4)) {
                int n = Integer.parseInt(command[1]);

                for (int j = 1; j < 20; j++) {
                    seat[n][j] = seat[n][j + 1];
                }
                seat[n][20] = false;
            }
        }

        for (int i = 1; i < N+1; i++) {
            String person = "";

            for (int j = 1; j < 21; j++) {
                if (seat[i][j]) {
                    person += "1";
                } else {
                    person += "0";
                }
            }

            train.add(person);
        }

        System.out.println(train.size());
    }
}
