import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        // 확장자 종류
        Set<String> extension = new TreeSet<>();
        // 확장자 갯수를 넣을 hashmap
        HashMap<String, Integer> count = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String[] input = reader.readLine().split("\\.");


            extension.add(input[1]);
            count.put(input[1], count.getOrDefault(input[1], 0) + 1);
        }

        StringBuilder result = new StringBuilder();

        for (String s : extension) {
            result.append(s).append(" ").append(count.get(s)).append("\n");
        }

        System.out.println(result);
    }
}
