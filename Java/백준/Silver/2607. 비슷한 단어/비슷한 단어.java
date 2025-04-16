import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        String words = reader.readLine();
        int[] word = new int[26];

        for (char c : words.toCharArray()) {
            int idx = c - 'A';
            word[idx] ++;
        }
        int result = 0;

        for (int i = 0; i < N - 1; i++) {
            String similarWord = reader.readLine();
            int[] similar = new int[26];
            for (char c : similarWord.toCharArray()) {
                int idx = c - 'A';
                similar[idx] ++;
            }
            int cnt = 0;
            for (int j = 0; j < 26; j++) {
                cnt += Math.abs(word[j] - similar[j]);
            }
            if (words.length() == similarWord.length() + 1 && cnt == 1) {
                result ++;
            } else if (words.length() == similarWord.length() && cnt < 3) {
                result ++;
            } else if (words.length() + 1 == similarWord.length() && cnt == 1) {
                result ++;
            }
        }
        System.out.println(result);
    }
}
