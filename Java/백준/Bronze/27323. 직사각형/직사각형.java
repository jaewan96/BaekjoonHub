import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int row = Integer.parseInt(reader.readLine());
        int col = Integer.parseInt(reader.readLine());
        System.out.println(row * col);
    }
}