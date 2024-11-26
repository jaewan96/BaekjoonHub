import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int num = N / 5;
        int remain = N % 5;
        int result = -1;

        while (num >= 0) {
            if (remain % 3 == 0) {
                result = num + (remain / 3);
                break;
            } else {
                num -= 1;
                remain += 5;
            }
        }
        System.out.println(result);
    }
}
