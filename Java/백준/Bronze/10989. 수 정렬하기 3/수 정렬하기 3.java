import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] list = new int[10001];
        
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(reader.readLine());
            list[num] ++;
        }
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < 10001; i++) {
            while (list[i]-- > 0) {
                output.append(i).append('\n');
            }
        }
        System.out.print(output);
    }
}