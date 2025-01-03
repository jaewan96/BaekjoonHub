import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        int sum = 0;
        map.put(0, 1);

        StringTokenizer st1 = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(st1.nextToken());

            if (map.containsKey(sum - M)) {
                cnt += map.get(sum - M);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(cnt);
    }
}
