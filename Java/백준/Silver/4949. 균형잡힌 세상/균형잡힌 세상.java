import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        while (true) {
            String input = reader.readLine();
            if (input.equals(".")) {
                break;
            }
            char[] chars = input.toCharArray();
            Stack<Character> stack = new Stack<>();
            boolean balance = true;

            for (char c : chars) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty()) {
                        balance = false;
                        break;
                    } else {
                        char out = stack.pop();
                        if (out != '(') {
                            balance = false;
                            break;
                        }
                    }

                } else if (c == '[') {
                    stack.push(c);
                } else if (c == ']') {
                    if (stack.isEmpty()) {
                        balance = false;
                        break;
                    } else {
                        char out = stack.pop();
                        if (out != '[') {
                            balance = false;
                            break;
                        }
                    }
                }
            }
            if (!stack.isEmpty() || !balance) {
                result.append("no").append("\n");
            } else {
                result.append("yes").append("\n");
            }
        }
        if (result.length() > 0) {
            result.deleteCharAt(result.length() - 1);
        }
        System.out.println(result);
    }
}
