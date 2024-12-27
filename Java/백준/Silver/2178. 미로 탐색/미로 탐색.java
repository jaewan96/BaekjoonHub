import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] matrix = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] arr = reader.readLine().split("");
            for (int j = 0; j < M; j++) {
                matrix[i][j] = Integer.parseInt(arr[j]);
            }
        }

        int result = bfs(matrix, N, M);
        System.out.println(result+1);
    }

    public static int bfs(int[][] matrix, int row, int col) {
        boolean[][] visited = new boolean[row][col];
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        Deque<mat> q = new LinkedList<>();
        q.add(new mat(0, 0, 0));
        visited[0][0] = true;
        while (!q.isEmpty()) {
            mat mat = q.poll();
            if (mat.row == row-1 && mat.col == col-1) {
                return mat.cnt;
            }
            for (int i = 0; i < 4; i++) {
                int nx = mat.row + dx[i];
                int ny = mat.col + dy[i];
                if (nx >= 0 && nx < row && ny >= 0 && ny < col && !visited[nx][ny] && matrix[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    q.add(new mat(nx, ny, mat.cnt+1));
                }
            }
        }
        return 0;
    }

    static class mat {
        int row;
        int col;
        int cnt;

        public mat(int row, int col, int cnt) {
            this.row = row;
            this.col = col;
            this.cnt = cnt;
        }
    }
}
