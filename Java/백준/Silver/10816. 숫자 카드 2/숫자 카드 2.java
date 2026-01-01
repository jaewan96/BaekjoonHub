import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        String[] stringCard = reader.readLine().split(" ");

        HashMap<Integer, Integer> card = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(stringCard[i]);
            card.put(num, card.getOrDefault(num, 0) + 1);
        }

        int M = Integer.parseInt(reader.readLine());

        String[] checkCard = reader.readLine().split(" ");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(checkCard[i]);

            result.append(card.getOrDefault(num, 0)).append(" ");
        }

        System.out.println(result);
    }
}
