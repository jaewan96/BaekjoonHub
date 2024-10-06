import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int number = Integer.parseInt(reader.readLine());
        int multiply = Integer.parseInt(reader.readLine());
        
        int hundred = multiply / 100;
        int ten = (multiply / 10) % 10;
        int unit = multiply % 10;
        
        int unitNumber = unit * number;
        int tenNumber = ten * number * 10;
        int hundredNumber = hundred * number * 100;
        System.out.println(unitNumber);
        System.out.println(tenNumber / 10);
        System.out.println(hundredNumber / 100);
        System.out.println(unitNumber + tenNumber + hundredNumber);
    }
}