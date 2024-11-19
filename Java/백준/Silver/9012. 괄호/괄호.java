import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < N; i++) {
            boolean vps = true;
            Stack<String> stack = new Stack<>();
            String[] input = reader.readLine().split("");
            for (int j = 0; j < input.length; j++) {
                if (input[j].equals("(")) {
                    stack.push(input[j]);
                } else {
                    if (stack.isEmpty()) {
                        vps = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (!stack.isEmpty() || !vps ) {
                result.append("NO").append("\n");
            } else {
                result.append("YES").append("\n");
            }
        }
        if (result.length() > 0) {
            result.deleteCharAt(result.length() - 1);
        }
        System.out.println(result);
    }
}