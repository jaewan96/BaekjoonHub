import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N+1][N+1];

        for (int i = 1; i < N+1; i++) {
            st = new StringTokenizer(reader.readLine());
            for (int j = 1; j < N+1; j++) {
                arr[i][j] = arr[i-1][j] + arr[i][j-1] - arr[i-1][j-1] + Integer.parseInt(st.nextToken());
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(reader.readLine());
            int x1 = Integer.parseInt(st2.nextToken());
            int y1 = Integer.parseInt(st2.nextToken());
            int x2 = Integer.parseInt(st2.nextToken());
            int y2 = Integer.parseInt(st2.nextToken());

            result.append(arr[x2][y2] - arr[x1 - 1][y2] - arr[x2][y1-1] + arr[x1-1][y1 - 1]).append("\n");
        }
        System.out.println(result);
    }
}
