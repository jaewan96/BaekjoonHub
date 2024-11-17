import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<>();
        
        for (int i = 0; i < N; i ++) {
            set.add(reader.readLine());
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < M; i ++) {
            String name = reader.readLine();
            if (set.contains(name)) {
                list.add(name);
            }
        }
        StringBuilder result = new StringBuilder();
        result.append(list.size()).append("\n");
        Collections.sort(list);
        result.append(String.join("\n", list));
        System.out.print(result.toString());
    }
}