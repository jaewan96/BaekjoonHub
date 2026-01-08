import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(reader.readLine());

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String word = reader.readLine();

            char[] words = word.toCharArray();

            int a = words.length - 2;

            while (a >= 0 && words[a] >= words[a + 1]) {
                a --;
            }

            if (a == -1) {
                result.append(word).append("\n");
            } else {
                int b = words.length - 1;

                while (words[a] >= words[b]) {
                    b--;
                }

                result.append(swap(words, a, b)).append("\n");
            }

        }

        System.out.println(result);
    }

    private static String swap(char[] text, int x, int y) {
        char temp = text[x];

        text[x] = text[y];
        text[y] = temp;

        int k = text.length - 1;

        x ++;
        while (k > x) {
            char tmp = text[x];
            text[x] = text[k];
            text[k] = tmp;

            x ++;
            k --;
        }

        String swapWord = new String(text);
        return swapWord;
    }
}
