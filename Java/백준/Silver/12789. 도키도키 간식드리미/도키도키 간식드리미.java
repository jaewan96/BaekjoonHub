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
        int cnt = 1;

        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == cnt) {
                cnt += 1;
            } else {
                while (!stack.isEmpty() && stack.peek() == cnt) {
                    cnt += 1;
                    stack.pop();
                }
                stack.push(num);
            }
        }

        while (!stack.isEmpty() && stack.peek() == cnt) {
            cnt += 1;
            stack.pop();
        }
        if (stack.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}
