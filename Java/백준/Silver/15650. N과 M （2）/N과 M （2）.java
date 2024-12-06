import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[N + 1];
        List<Integer> lst = new ArrayList<>();
        def(N, M, lst, visited);
        System.out.println(result);
    }

    public static void def(int n, int m, List<Integer> lst, boolean[] visit) {
        if (lst.size() == m) {
            for (int i = 0; i < m; i++) {
                result.append(lst.get(i)).append(" ");
            }
            result.append("\n");
            return;
        }
        for (int i = 1; i < n+1; i++) {
            if (!lst.isEmpty()) {
                if (!visit[i] && lst.get(lst.size()-1) < i) {
                    lst.add(i);
                    visit[i] = true;
                    def(n, m, lst, visit);
                    visit[i] = false;
                    lst.remove(lst.size()-1);
                }
            } else {
                lst.add(i);
                visit[i] = true;
                def(n, m, lst, visit);
                visit[i] = false;
                lst.remove(lst.size()-1);
            }
        }
    }
}
