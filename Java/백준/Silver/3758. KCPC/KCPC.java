import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        StringBuilder result = new StringBuilder();

        for (int test = 0; test < T; test++) {

            String[] input = reader.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int k = Integer.parseInt(input[1]);
            int t = Integer.parseInt(input[2]);
            int m = Integer.parseInt(input[3]);

            int[][] team = new int[n + 1][k + 1];
            int[] solve = new int[n + 1];
            int[] last = new int[n + 1];
            for (int i = 0; i < m; i++) {
                String[] data = reader.readLine().split(" ");
                int id = Integer.parseInt(data[0]);
                int no = Integer.parseInt(data[1]);
                int s = Integer.parseInt(data[2]);

                if (team[id][no] < s) {
                    team[id][no] = s;
                }
                solve[id] ++;
                last[id] = i;
            }
            int win = 1;
            int score = 0;
            for (int i = 1; i < k+1; i++) {
                score += team[t][i];
            }

            for (int i = 1; i < n + 1; i++) {
                if (i == t) continue;
                int num = 0;
                for (int j = 1; j < k+1; j++) {
                    num += team[i][j];
                }
                if (score < num) {
                    win ++;
                } else if (score == num) {
                    if (solve[t] > solve[i]) {
                        win ++;
                    } else if (solve[t] == solve[i]) {
                        if (last[t] > last[i]) {
                            win ++;
                        }
                    }
                }
            }
            result.append(win).append("\n");
        }
        System.out.println(result);
    }
}
