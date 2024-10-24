import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String input = reader.readLine();
        StringTokenizer st = new StringTokenizer(input);
        
        String num = st.nextToken();
        int base = Integer.parseInt(st.nextToken());
        
        long result = Long.parseLong(num, base);
        System.out.print(result);
    }
}