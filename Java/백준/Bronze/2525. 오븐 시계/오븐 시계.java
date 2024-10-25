import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        StringTokenizer st = new StringTokenizer(input);
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        int C = Integer.parseInt(reader.readLine());
        int hour = (B + C) / 60;
        if (B + C < 60) {
            System.out.print(A + " " + (B + C));
        } else if (A + hour >= 24) {
            System.out.print((A + hour - 24) + " " + ((B + C)% 60));
        } else {
            System.out.print((A + hour) + " " + ((B + C)% 60));
        }
    }
}