import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        StringBuilder result = new StringBuilder();

        HashMap<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String word = reader.readLine();
            if (word.length() >= M) {
                map.put(word, map.getOrDefault(word, 0) + 1);
                set.add(word);
            }
        }


        List<List<String>> arr = new ArrayList<>();

        for (int i = 0; i < N + 1; i++) {
            arr.add(new ArrayList<>());
        }

        for (String key : set) {
            int value = map.get(key);
            arr.get(value).add(key);
        }

        for (int i = N; i > 0; i--) {
            if (!arr.get(i).isEmpty()) {
                if (arr.get(i).size() == 1) {
                    result.append(arr.get(i).get(0)).append("\n");
                } else {

                    arr.get(i).sort(Comparator.naturalOrder());
                    arr.get(i).sort((a, b) -> b.length() - a.length());
                    for (String word : arr.get(i)) {
                        result.append(word).append("\n");
                    }
                }

            }
        }
        System.out.println(result);
    }
}
