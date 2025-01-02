import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        String[][] arr = new String[N][2];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            String age = st.nextToken();
            String name = st.nextToken();
            arr[i] = new String[]{age, name};
        }

        Arrays.sort(arr, Comparator.comparingInt( o -> Integer.parseInt(o[0])));
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                result.append(arr[i][j]).append(" ");
            }
            result.append("\n");
        }
        System.out.println(result);
    }
}
