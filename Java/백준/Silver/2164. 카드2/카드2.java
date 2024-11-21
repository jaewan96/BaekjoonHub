import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        Queue<Integer> q = new LinkedList<>();
        int cnt = 0;
        int result = 0;

        for (int i = 1; i < N+1; i ++) {
            q.add(i);
        }

        while (!q.isEmpty()) {
            if (cnt == 0) {
                result = q.remove();
                cnt = 1;
            } else {
                cnt = 0;
                result = q.remove();
                q.add(result);
            }
        }
        System.out.println(result);
    }
}
