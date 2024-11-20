import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        Queue<Integer> q = new LinkedList<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String[] input = reader.readLine().split(" ");
            if (input[0].equals("push")) {
                q.add(Integer.parseInt(input[1]));
            } else if (input[0].equals("pop")) {
                if (q.isEmpty()) {
                    result.append(-1).append("\n");
                } else {
                    result.append(q.poll()).append("\n");
                }
            } else if (input[0].equals("size")) {
                result.append(q.size()).append("\n");
            } else if (input[0].equals("empty")) {
                if (q.isEmpty()) {
                    result.append(1).append("\n");
                } else {
                    result.append(0).append("\n");
                }
            } else if (input[0].equals("front")) {
                if (q.isEmpty()) {
                    result.append(-1).append("\n");
                } else {
                    result.append(q.peek()).append("\n");
                }
            } else if (input[0].equals("back")) {
                if (q.isEmpty()) {
                    result.append(-1).append("\n");
                } else {
                    result.append(((LinkedList<Integer>) q).getLast()).append("\n");
                }
            }
        }
        System.out.println(result);
    }
}
