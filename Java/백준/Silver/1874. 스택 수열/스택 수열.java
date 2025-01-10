import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] arr = new int[N];
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        boolean possible = true;
        
        for (int i = 0; i < N; i ++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        
        int start = 1;
        stack.push(1);
        for (int i = 0; i< N; i ++) {
            while (start <= arr[i]) {
                stack.push(start);
                result.append("+").append("\n");
                start ++;
            }
            
            if (stack.peek() == arr[i]) {
                stack.pop();
                result.append("-").append("\n");
            } else {
                possible = false;
                break;
            }
        }
        if (possible) {
            System.out.print(result);
        } else {
            System.out.print("NO");
        }
    }
}