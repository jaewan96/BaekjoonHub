import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String input = reader.readLine();
        int year = Integer.parseInt(input);
        
        if (year % 400 == 0) {
            System.out.println(1);
        } else if (year % 100 != 0 && year % 4 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}