import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        for (char c : word.toCharArray()) {
            left.add(c);
        }

        int N = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            String[] input = reader.readLine().split(" ");
            if (input[0].equals("P")) {
                char c = input[1].charAt(0);
                left.add(c);
            } else if (input[0].equals("L")) {
                if (!left.isEmpty()) {
                    right.push(left.pop());
                }
            } else if (input[0].equals("D")) {
                if (!right.isEmpty()) {
                    left.push(right.pop());
                }
            } else if (input[0].equals("B")) {
                if (!left.isEmpty()) {
                    left.pop();
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : left) {
            result.append(c);
        }

        while (!right.isEmpty()) {
            result.append(right.pop());
        }
        System.out.println(result);
    }
}
