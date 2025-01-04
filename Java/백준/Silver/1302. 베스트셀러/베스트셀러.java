import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String input = reader.readLine();
            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        int max = 0;
        List<String> lst = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                lst.clear();
                lst.add(entry.getKey());
            } else if (entry.getValue() == max) {
                lst.add(entry.getKey());
            }
        }

        Collections.sort(lst);
        System.out.println(lst.get(0));
    }
}
