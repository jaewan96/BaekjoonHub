import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < N-1; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            map.putIfAbsent(x, new ArrayList<>());
            map.putIfAbsent(y, new ArrayList<>());
            map.get(x).add(y);
            map.get(y).add(x);
        }

        int[] parent = new int[N + 1];
        boolean[] visited = new boolean[N + 1];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;
        while (!queue.isEmpty()) {
            int now = queue.poll();
            List<Integer> list = map.get(now);
            for (int i = 0; i < list.size(); i++) {
                if (!visited[list.get(i)]) {
                    visited[list.get(i)] = true;
                    queue.add(list.get(i));
                    parent[list.get(i)] = now;
                }
            }

        }

        StringBuilder result = new StringBuilder();
        for (int i = 2; i < N+1; i++) {
            result.append(parent[i]).append("\n");
        }
        System.out.println(result);
    }

}
