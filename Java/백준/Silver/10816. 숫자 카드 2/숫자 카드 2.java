import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        
        StringTokenizer first = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i ++) {
            int card = Integer.parseInt(first.nextToken());
            map.put(card, map.getOrDefault(card, 0)+1);
        }
        
        int M = Integer.parseInt(reader.readLine());
        StringTokenizer sec = new StringTokenizer(reader.readLine());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < M; i ++) {
            int card = Integer.parseInt(sec.nextToken());
            result.append(map.getOrDefault(card, 0)).append(" ");
        }
        System.out.print(result.toString().trim());
    }
}