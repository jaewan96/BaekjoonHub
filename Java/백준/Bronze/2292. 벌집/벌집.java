import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        int cnt = 0;
        int num = 1;
        while (true) {
            if (N <= num) {
                System.out.print(cnt+1);
                break;
            }
            cnt++;
            num = num + (6 * cnt); 
       }
    }
}