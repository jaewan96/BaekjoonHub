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
        List<Integer> lst = new ArrayList<Integer>();

        back(N, M, lst);
        System.out.println(result);
    }

    public static void back(int n, int m, List<Integer> lst) {
        if (lst.size() == m) {
            for (int i = 0; i < m; i++) {
                result.append(lst.get(i)).append(" ");
            }
            result.append("\n");
            return;
        }
        for (int i = 1; i < n+1; i++) {
            lst.add(i);
            back(n, m, lst);
            lst.remove(lst.size() - 1);
        }
    }
}
