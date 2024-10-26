import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = reader.readLine();
            StringTokenizer st = new StringTokenizer(input);
            int first = Integer.parseInt(st.nextToken());
            int sec = Integer.parseInt(st.nextToken());
            
            if (first == 0 && sec == 0) {
                break;
            }
            if (first % sec == 0) {
                System.out.println("multiple");
            } else if (sec % first == 0) {
                System.out.println("factor");
            } else {
                System.out.println("neither");
            }
        }
    }
}