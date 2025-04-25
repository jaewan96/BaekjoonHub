import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] arr = new int[N];
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String[] names = reader.readLine().split(" ");
            String name = names[0];
            int fightScore = Integer.parseInt(names[1]);
            arr[i] = fightScore;
            map.putIfAbsent(fightScore, name);
        }

        StringBuilder result = new StringBuilder();
        Arrays.sort(arr);
        for (int i = 0; i < M; i++) {
            int score = Integer.parseInt(reader.readLine());
            if (arr[0] >= score) {
                result.append(map.get(arr[0])).append("\n");
            } else {
                int s = 0;
                int e = N-1;
                while (s <= e) {
                    int m = (e + s) / 2;

                    if (arr[m] > score) {
                        if (m-1 >=0 && arr[m - 1] < score) {
                            result.append(map.get(arr[m])).append("\n");
                            break;
                        }
                        e = m-1;
                        m = (s + e) / 2;
                    } else if (arr[m] < score) {
                        s = m+1;
                        m = (s + e) / 2;
                    } else if (arr[m] == score) {
                        result.append(map.get(arr[m])).append("\n");
                        break;
                    }
            }

            }

        }
        System.out.println(result);
    }
}
