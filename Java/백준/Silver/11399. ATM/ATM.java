import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.* ;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        List<Integer> list = new ArrayList<>();
        int result = 0;
        
        String input = reader.readLine();
        StringTokenizer st = new StringTokenizer(input);
        
        for (int i = 0; i < N; i ++) {
            int P = Integer.parseInt(st.nextToken());
            list.add(P);
        }
        Collections.sort(list);
        int wait = 0;
        for (int num : list) {
            wait += num;
            result += wait;
        }
        System.out.print(result);
    }
}