import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        Deque<Integer> q = new ArrayDeque<Integer>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            String input = st.nextToken();
            if (input.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                q.offer(num);
            } else if (input.equals("pop")) {
                if (q.isEmpty()) {
                    result.append(-1).append("\n");
                } else {
                    result.append(q.poll()).append("\n");
                }
            } else if (input.equals("size")) {
                result.append(q.size()).append("\n");
            } else if (input.equals("empty")) {
                if (q.isEmpty()) {
                    result.append(1).append("\n");
                } else {
                    result.append(0).append("\n");
                }
            } else if (input.equals("front")) {
                if (q.isEmpty()) {
                    result.append(-1).append("\n");
                } else {
                    result.append(q.peek()).append("\n");
                }
            } else if (input.equals("back")) {
                if (q.isEmpty()) {
                    result.append(-1).append("\n");
                } else {
                    result.append(q.peekLast()).append("\n");
                }
            }
        }
        System.out.println(result);
    }
}
