import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        Set<String> set = new HashSet<>();
        
        for (int i = 0; i < N; i ++) {
            String alp = reader.readLine();
            set.add(alp);
        }
        List<String> list = new ArrayList<>(set);
        list.sort(Comparator.comparingInt(String::length).thenComparing(String::compareTo));
        
        String result = String.join("\n", list);
        System.out.print(result);
    }
}