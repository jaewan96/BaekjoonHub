import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        Deque<Integer> deque = new LinkedList<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String[] input = reader.readLine().split(" ");
            if (input[0].equals("1")) {
                deque.addFirst(Integer.parseInt(input[1]));
            } else if (input[0].equals("2")) {
                deque.add(Integer.parseInt(input[1]));
            } else if (input[0].equals("3")) {
                if (!deque.isEmpty()) {
                    result.append(deque.removeFirst()).append("\n");
                } else {
                    result.append(-1).append("\n");
                }
            } else if (input[0].equals("4")) {
                if (!deque.isEmpty()) {
                    result.append(deque.removeLast()).append("\n");
                } else  {
                    result.append(-1).append("\n");
                }
            } else if (input[0].equals("5")) {
                result.append(deque.size()).append("\n");
            } else if (input[0].equals("6")) {
                if (!deque.isEmpty()) {
                    result.append(0).append("\n");
                } else {
                    result.append(1).append("\n");
                }
            } else if (input[0].equals("7")) {
                if (!deque.isEmpty()) {
                    result.append(deque.peekFirst()).append("\n");
                } else {
                    result.append(-1).append("\n");
                }
            } else if (input[0].equals("8")) {
                if (!deque.isEmpty()) {
                    result.append(deque.peekLast()).append("\n");
                } else {
                    result.append(-1).append("\n");
                }
            }
        }
        System.out.println(result.toString());
    }
}
