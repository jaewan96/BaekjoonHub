import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        StringTokenizer st = new StringTokenizer(input);
        
        int first = Integer.parseInt(st.nextToken());
        int sec = Integer.parseInt(st.nextToken());
        int thir = Integer.parseInt(st.nextToken());
        
        if (first == sec && sec == thir) {
            System.out.print(10000 + (first * 1000));
        } else if (first == sec || first == thir) {
            System.out.print(1000 + (first * 100));
        } else if (sec == thir) {
            System.out.print(1000 + (sec * 100));
        } else {
            int max = Math.max(first, Math.max(sec, thir));
            System.out.print(max * 100);
        }
    }
}