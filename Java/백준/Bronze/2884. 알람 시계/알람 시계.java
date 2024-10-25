import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        StringTokenizer st = new StringTokenizer(input);
        
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        if (M >= 45) {
            System.out.println(H + " " + (M-45));
        } else if (H > 0) {
            System.out.println((H-1) + " " + (M + 15));
        } else {
            System.out.println(23 + " " + (M + 15));
        }
    }
}