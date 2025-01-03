import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        StringBuilder result = new StringBuilder();

        StringTokenizer st1 = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                arr[i] = Integer.parseInt(st1.nextToken());
            } else {
                arr[i] = arr[i-1] + Integer.parseInt(st1.nextToken());
            }
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(st2.nextToken());
            int y = Integer.parseInt(st2.nextToken());
            if (x == 1) {
                result.append(arr[y-1]).append("\n");
            } else {
                result.append(arr[y-1] - arr[x-2]).append("\n");
            }
        }
        System.out.println(result);
    }
}
