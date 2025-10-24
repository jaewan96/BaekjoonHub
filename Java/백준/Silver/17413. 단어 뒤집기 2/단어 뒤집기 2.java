import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("");

        String result = "";

        Stack<String> reverse = new Stack<>();
        boolean tag = false;

        for (String word : input) {
            if (word.equals("<")) {
                while (!reverse.isEmpty()) {
                    result += reverse.pop();
                }
                tag = true;
                result += word;
            } else if (word.equals(">")) {
                tag = false;
                result += word;
            } else if (!tag && word.equals(" ")) {
                while (!reverse.isEmpty()) {
                    result += reverse.pop();
                }
                result += word;
            } else if (tag) {
                result += word;
            } else {
                reverse.add(word);
            }
        }

        while (!reverse.isEmpty()) {
            result += reverse.pop();
        }
        System.out.println(result);
    }
}
