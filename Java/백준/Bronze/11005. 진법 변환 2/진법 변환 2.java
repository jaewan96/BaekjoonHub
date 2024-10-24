import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String input = reader.readLine();
        StringTokenizer st = new StringTokenizer(input);
        
        int num = Integer.parseInt(st.nextToken());
        int base = Integer.parseInt(st.nextToken());
        
        StringBuilder baseNum = new StringBuilder();
        while (num > 0) {
            int remain = num % base;
            num /= base;
            if (remain > 9) {
                baseNum.append((char) ('A' + (remain - 10)));
            } else {
                baseNum.append(remain);
            }
        }
        baseNum.reverse();
        System.out.print(baseNum.toString());
    }
}