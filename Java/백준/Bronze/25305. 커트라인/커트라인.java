import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] lst = new int[N];
        
        String next = reader.readLine();
        StringTokenizer token = new StringTokenizer(next);
        for (int i = 0 ; i < N; i++) {
            int student = Integer.parseInt(token.nextToken());
            lst[i] = student;
        }
        Arrays.sort(lst);
        System.out.print(lst[N-k]);
    }
}