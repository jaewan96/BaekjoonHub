import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        Deque<int[]> deque = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();

        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 1; i < N+1; i++) {
            int input = Integer.parseInt(st.nextToken());
            deque.add(new int[]{input, i});
        }

        int[] start = deque.removeFirst();
        result.append(start[1]).append(" ");
        int num = start[0];
        while (!deque.isEmpty()) {
            if (num > 0) {
                for (int i = 0; i < num-1; i ++) {
                    deque.addLast(deque.removeFirst());
                }
            } else {
                for (int i = 0; i < -num; i ++) {
                    deque.addFirst(deque.removeLast());
                }
            }
            start = deque.removeFirst();
            result.append(start[1]).append(" ");
            num = start[0];
        }
        System.out.println(result);
    }
}
