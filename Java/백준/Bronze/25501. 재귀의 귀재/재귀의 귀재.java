import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String[] alp = reader.readLine().split("");
            cnt = 0;
            int num = Palindrome(alp, 0, alp.length - 1);
            result.append(num).append(" ").append(cnt).append("\n");
        }
        System.out.println(result);
    }

    public static int Palindrome(String[] str, int start, int end) {
        cnt ++;
        if (start >= end) {
            return 1;
        } else if (!str[start].equals(str[end])) {
            return 0;
        } else {
            return Palindrome(str, start + 1, end-1);
        }
    }

}