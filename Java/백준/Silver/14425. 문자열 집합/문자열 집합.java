import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<>();
        int cnt = 0;
        
        for (int i = 0; i < N; i ++) {
            set.add(reader.readLine());
        }
        
        for (int i = 0; i < M; i ++) {
            if (set.contains(reader.readLine())) {
                cnt += 1;
            }
        }
        System.out.print(cnt);
    }
}