import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String words = reader.readLine();

        int oneCnt = 0;
        int zeroCnt = 0;
        for (char c : words.toCharArray()) {
            if (c == '1') {
                oneCnt++;
            } else {
                zeroCnt++;
            }
        }

        int one = oneCnt / 2;
        int zero = zeroCnt / 2;
        StringBuilder result = new StringBuilder();
        for (char c : words.toCharArray()) {
            if (c == '0' && zero > 0) {
                result.append(0);
                zero --;
            } else if (c == '1' && one > 0) {
                one --;
            } else if (c == '1')
                result.append(1);
        }
        System.out.println(result);
    }
}
