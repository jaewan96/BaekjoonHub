import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int num = Integer.parseInt(reader.readLine());
        long[][] arr = new long[N][N];

        int num_x = 0;
        int num_y = 0;

        int x = N / 2 ;
        int y = N / 2 ;
        arr[x][y] = 1;

        int[] dx = new int[]{-1, 0, 1, 0, -1, 0, 1};
        int[] dy = new int[]{0, 1, 0, -1, 0, 1, 0};
        int dir = 0;
        int n = 1;
        long cnt = 1;

        if (cnt == num) {
            num_x = x;
            num_y = y;
        }

        StringBuilder result = new StringBuilder();

        while (true) {
            if (dir > 4) {
                dir %= 4;
            }

            while (arr[x + dx[dir]][y + dy[dir]] == 0) {
                for (int j = 0; j < n; j++) {
                    x += dx[dir];
                    y += dy[dir];
                    cnt ++;
                    arr[x][y] = cnt;

                    if (cnt == num) {
                        num_x = x;
                        num_y = y;
                    }
                }
                dir ++;
            }

            if (cnt == N * N) {
                break;
            }

            x += dx[dir-1];
            y += dy[dir-1];
            cnt ++;
            arr[x][y] = cnt;
            n ++;

            if (cnt == num) {
                num_x = x;
                num_y = y;
            }

        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result.append(arr[i][j]).append(' ');
            }
            result.append('\n');
        }

        result.append(num_x + 1).append(' ').append(num_y + 1);
        System.out.println(result);
    }
}
