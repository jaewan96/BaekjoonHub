import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        Stack<Integer> stack = new Stack<Integer>();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String[] input = reader.readLine().split(" ");
            if (input[0].equals("1")) {
                stack.push(Integer.parseInt(input[1]));
            } else if (input[0].equals("2")) {
                if (stack.isEmpty()) {
                    result.append(-1).append("\n");
                } else {
                    result.append(stack.pop()).append("\n");
                }
            } else if (input[0].equals("3")) {
                result.append(stack.size()).append("\n");
            } else if (input[0].equals("4")) {
                if (stack.isEmpty()) {
                    result.append(1).append("\n");
                } else {
                    result.append(0).append("\n");
                }
            } else {
                if (stack.isEmpty()) {
                    result.append(-1).append("\n");
                } else {
                    result.append(stack.peek()).append("\n");
                }
            }
        }
        if (result.length() > 0) {
            result.deleteCharAt(result.length() - 1);
        }
        System.out.println(result);
    }
}