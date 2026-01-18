import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean[] visit;
    static char[] map;
    static int jump = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        String input = reader.readLine();

        map = input.toCharArray();
        visit = new boolean[N];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                dfs(i);
                if (jump > 1) {
                    cnt ++;
                }
                jump = 0;
            }
        }

        System.out.println(cnt);
    }

    private static void dfs(int n) {
        visit[n] = true;
        jump ++;

        // 문제에서 지도를 벗어나는 경우가 없다고 명시했기 때문에 조건문에 범위를 넣지 않음
        if (map[n] == 'E' && !visit[n + 1]) {
            dfs(n + 1);
        } else if (map[n] == 'W' && !visit[n - 1]) {
            dfs(n - 1);
        }
    }
}
