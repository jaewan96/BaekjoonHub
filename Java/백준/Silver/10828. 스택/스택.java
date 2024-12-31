import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            String command = st.nextToken();
            if (command.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            } else if (command.equals("pop")) {
                if (stack.isEmpty()) {
                    result.append(-1).append("\n");
                } else {
                    result.append(stack.pop()).append("\n");
                }
            } else if (command.equals("size")) {
                result.append(stack.size()).append("\n");
            } else if (command.equals("empty")) {
                if (stack.isEmpty()) {
                    result.append(1).append("\n");
                } else {
                    result.append(0).append("\n");
                }
            } else if (command.equals("top")) {
                if (stack.isEmpty()) {
                    result.append(-1).append("\n");
                } else {
                    result.append(stack.peek()).append("\n");
                }
            }
        }
        System.out.println(result);
    }
}
