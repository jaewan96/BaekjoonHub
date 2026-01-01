import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        StringTokenizer st = new StringTokenizer(reader.readLine());
        int[] coordinate = new int[N];
        int[] sortCoordinate = new int[N];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            coordinate[i] = num;
            sortCoordinate[i] = num;
        }

        Arrays.sort(sortCoordinate);

        HashMap<Integer, Integer> compression = new HashMap<>();

        int cnt = 0;
        int x = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                x = sortCoordinate[i];
                compression.put(x, cnt);
                cnt ++;
            } else if (x != sortCoordinate[i]) {
                x = sortCoordinate[i];
                compression.put(x, cnt);
                cnt ++;
            }

        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            result.append(compression.get(coordinate[i])).append(" ");
        }

        System.out.println(result);
    }
}
