import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    static int[][][] dp;
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] lst = reader.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(lst[j]);
            }
        }
        int[] dx = new int[]{1, 1, 1};
        int[] dy = new int[]{-1, 0, 1};

        dp = new int[N][M][3];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int d = 0; d < 3; d++) {
                    dp[i][j][d] = Integer.MAX_VALUE;
                }
            }
        }
        Deque<coordinate> q = new ArrayDeque<>();
        for (int j = 0; j < M; j++) {
            for (int d = 0; d < 3; d++) {
                int nj = j + dy[d];
                if (nj >= 0 && nj < M) {
                    dp[1][nj][d] = arr[0][j] + arr[1][nj];
                    q.add(new coordinate(1, nj));
                }
            }
        }

        while (!q.isEmpty()) {
            coordinate coor = q.pollFirst();
            int r = coor.x;
            int c = coor.y;

            for (int t = 0; t < 3; t++) {
                    int dr = dx[t] + r;
                    int dc = dy[t] + c;
                    if (dr < N && dc >= 0 && dc < M ) {
                        for (int k = 0; k < 3; k++) {
                            if (k != t ) {
                                if (dp[r][c][k] != Integer.MAX_VALUE && dp[dr][dc][t] > dp[r][c][k] + arr[dr][dc]) {
                                    dp[dr][dc][t] = dp[r][c][k] + arr[dr][dc];
                                    q.add(new coordinate(dr, dc));
                                }
                            }
                        }
                    }
                }


        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 3; j++) {
                min = Math.min(min, dp[N-1][i][j]);

            }

        }
        System.out.println(min);
    }

    static class coordinate {
        int x;
        int y;


        public coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
