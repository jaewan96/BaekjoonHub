import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            String[] input = reader.readLine().split(" ");

            int[] lst = new int[N];
            for (int j = 0; j < N; j++) {
                lst[j] = Integer.parseInt(input[j]);
                if (i == 0) {
                    q.add(lst[j]);
                }
            }
            if (i > 0) {
                Arrays.sort(lst);
                int num = q.poll();
                int idx = N-1;
                while (idx >= 0) {
                    if (lst[idx] > num) {
                        q.add(lst[idx]);
                        num = q.poll();
                    } else {
                        q.add(num);
                        break;
                    }
                    idx --;
                }
            }
        }
        int result = q.poll();
        System.out.println(result);
    }
}
