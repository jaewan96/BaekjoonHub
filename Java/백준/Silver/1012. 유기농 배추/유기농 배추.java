import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[][] matrix = new int[M][N];
            List<Veg> list = new ArrayList<>();

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(reader.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                matrix[x][y] = 1;
                list.add(new Veg(x, y));
            }
            int num = bfs(M, N, matrix);
            result.append(num).append("\n");
        }
        System.out.println(result);
    }

    public static int bfs(int m, int n, int[][] matrix) {
        int[] dx = {0, 0, 1, - 1};
        int[] dy = {1, -1, 0, 0};
        boolean[][] visited = new boolean[m][n];
        int num = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1 && !visited[i][j]) {
                    num ++;
                    LinkedList<Veg> lst = new LinkedList<>();
                    lst.add(new Veg(i, j));
                    visited[i][j] = true;
                    while (!lst.isEmpty()) {
                        Veg veg = lst.removeFirst();
                        int x = veg.x;
                        int y = veg.y;
                        for (int k = 0; k < 4; k++) {
                            int a = x + dx[k];
                            int b = y + dy[k];
                            if (a >= 0 && b >= 0 && a < m && b < n && !visited[a][b] && matrix[a][b] == 1) {
                                visited[a][b] = true;
                                lst.add(new Veg(a, b));
                            }
                        }
                    }
                }
            }
        }
        return num;

    }

    static class Veg {
        int x;
        int y;

        public Veg(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
