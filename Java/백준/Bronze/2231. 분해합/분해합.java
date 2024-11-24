import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        boolean end = false;

        for (int i = 0; i < N; i++) {
            int result = i;
            String num = String.valueOf(i);
            for (char c : num.toCharArray()) {
                result += c - '0';
            }
            if (result == N) {
                end = true;
                System.out.println(i);
                break;
            }
        }
        if (!end) {
            System.out.println(0);
        }
    }
}
