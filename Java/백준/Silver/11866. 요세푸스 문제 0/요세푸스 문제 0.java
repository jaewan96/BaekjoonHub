import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        StringBuilder result = new StringBuilder("<");
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i < N+1; i++) {
            q.add(i);
        }

        while (!q.isEmpty()) {
            for (int i = 0; i < K-1; i++) {
                int num = q.remove();
                q.add(num);
            }
            result.append(q.remove());
            if (q.isEmpty()) {
                result.append(">");
            } else {
                result.append(", ");
            }
        }
        System.out.println(result);
    }
}
