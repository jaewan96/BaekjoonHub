import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        String[] input = reader.readLine().split(" ");
        int[] raiser = new int[N];
        Stack<int[]> stack = new Stack<>();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            raiser[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < N; i++) {
            if (stack.isEmpty()) {
                stack.add(new int[]{raiser[i], i+1});
                result.append(0).append(" ");
            } else {
                boolean check = false;
                while (!stack.isEmpty()) {
                    if (raiser[i] >= stack.peek()[0]) {
                        stack.pop();
                        check = true;
                    } else {
                        break;
                    }
                }
                if (stack.isEmpty()) {
                    result.append(0).append(" ");
                } else {
                    result.append(stack.peek()[1]).append(" ");
                }
                stack.add(new int[]{raiser[i], i + 1});
            }
        }
        System.out.println(result);
    }
}
