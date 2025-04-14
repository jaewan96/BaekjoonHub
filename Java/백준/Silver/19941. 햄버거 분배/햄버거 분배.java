import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        String[] table = reader.readLine().split("");
        boolean[] eat = new boolean[N];

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (table[i].equals("P")) {
                for (int j = i - K; j <= i + K; j++) {
                    if (j >= 0 && j < N && !eat[j] && table[j].equals("H")) {
                        eat[j] = true;
                        cnt ++;
                        break;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
