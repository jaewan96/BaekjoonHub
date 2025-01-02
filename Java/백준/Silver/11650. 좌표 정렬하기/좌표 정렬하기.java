import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[][] arr = new int[N][2];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i] = new int[]{x, y};
        }
        Arrays.sort(arr, (o1, o2) -> {return o1[1] - o2[1];});
        Arrays.sort(arr, (o1, o2) -> {return o1[0] - o2[0];});
//        Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[1]));
//        Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[0]));
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                result.append(arr[i][j]).append(" ");
            }
            result.append("\n");
        }
        System.out.println(result);
    }
}
