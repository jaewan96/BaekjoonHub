import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        Set<Integer> set = new HashSet<>();
        StringTokenizer num = new StringTokenizer(reader.readLine());
        for (int i = 0; i < A; i ++) {
            set.add(Integer.parseInt(num.nextToken()));
        }
        int cnt = 0;
        
        StringTokenizer numB = new StringTokenizer(reader.readLine());
        for (int i = 0; i < B; i ++) {
            int element = Integer.parseInt(numB.nextToken());
            if (set.contains(element)) {
                cnt += 1;
            }
        }
        System.out.print(A + B - (cnt * 2));
    }
}