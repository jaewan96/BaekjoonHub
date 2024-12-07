import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M, V;
    static List<Integer>[] list;
    static boolean[] visited;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        list = new ArrayList[N + 1];
        for (int i = 1; i < N+1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 1; i <= M; i++) {
            StringTokenizer st1 = new StringTokenizer(reader.readLine());
            int s = Integer.parseInt(st1.nextToken());
            int e = Integer.parseInt(st1.nextToken());
            list[s].add(e);
            list[e].add(s);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(list[i]);
        }
        visited = new boolean[N + 1];
        dfs(V);
        result.append("\n");
        visited = new boolean[N + 1];
        bfs(V);
        System.out.println(result);
    }

    public static void dfs(int n) {
        visited[n] = true;
        result.append(n).append(" ");

        for (int next : list[n]) {
            if (!visited[next]) {
                dfs(next);
            }
        }

    }

    public static void bfs(int start) {
        Deque<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int now = q.poll();
            result.append(now).append(" ");

            for (int next : list[now]) {
                if (!visited[next]) {
                    q.add(next);
                    visited[next] = true;
                }
            }
        }
    }
}
