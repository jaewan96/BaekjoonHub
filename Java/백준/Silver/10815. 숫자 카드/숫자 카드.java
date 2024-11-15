import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        Set<Integer> set = new HashSet<>();
       
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        
        int M = Integer.parseInt(reader.readLine());
        
        StringTokenizer newSt = new StringTokenizer(reader.readLine());
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < M; i++) {
            if (i > 0) {
                result.append(" ");
            }
            if (!set.contains(Integer.parseInt(newSt.nextToken()))) {
                result.append(0);
            } else {
                result.append(1);
            }
        }
        System.out.print(result);
    }
}
