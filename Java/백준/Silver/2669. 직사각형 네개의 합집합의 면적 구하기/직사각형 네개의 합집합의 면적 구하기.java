import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[][] visited = new int[101][101];
        int cnt = 0;

        for (int i = 0; i < 4; i++) {
            String[] input = reader.readLine().split(" ");
            int x1 = Integer.parseInt(input[0]);
            int y1 = Integer.parseInt(input[1]);
            int x2 = Integer.parseInt(input[2]);
            int y2 = Integer.parseInt(input[3]);

            for (int r = x1; r < x2; r++) {
                for (int c = y1; c < y2; c++) {
                    if (visited[r][c] == 0) {
                        visited[r][c] = 1;
                        cnt ++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}
