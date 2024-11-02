import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0 ; i < N; i ++) {
            int num = Integer.parseInt(reader.readLine());
            set.add(num);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        for (int num : list) {
            System.out.println(num);
        }
    }
}