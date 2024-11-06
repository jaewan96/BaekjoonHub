import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        Set<Integer> set = new HashSet<>();
        
        String input = reader.readLine();
        StringTokenizer st = new StringTokenizer(input);
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            set.add(num);
        }
        
        int M = Integer.parseInt(reader.readLine());
        int[] list = new int[M];
        
        String numberM = reader.readLine();
        StringTokenizer stM = new StringTokenizer(numberM);
        for (int i = 0; i < M; i ++) {
            int num = Integer.parseInt(stM.nextToken());
            list[i] = num;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < M; i ++) {
            if (set.contains(list[i])) {
                result.append("1\n");
            } else {
                result.append("0\n");
            }
        }
        System.out.print(result.toString());
    }
}