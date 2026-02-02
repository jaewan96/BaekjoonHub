import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(reader.readLine());

        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        StringBuilder result = new StringBuilder();

        HashSet<String> number = new HashSet<>();
        String[] lst = new String[L];
        for (int i = 0; i < L; i++) {
            String input = reader.readLine();
            lst[i] = input;
        }

        ArrayDeque<String> que = new ArrayDeque<>();
        for (int i = L - 1; i >= 0; i--) {
            if (!number.contains(lst[i])) {
                number.add(lst[i]);
                que.add(lst[i]);
            }
        }

        for (int i = 0; i < K; i++) {
            if (que.isEmpty()) {
                break;
            }
            result.append(que.pollLast()).append("\n");
        }

        System.out.println(result);
    }
}
