import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        
        for (int i = 0; i < T; i++) {
            int c = Integer.parseInt(reader.readLine());
            System.out.print(c / 25);
            c %= 25;
            System.out.print(" " + (c / 10));
            c %= 10;
            System.out.print(" " + (c / 5));
            System.out.println(" " + (c % 5));
        }
    }
}