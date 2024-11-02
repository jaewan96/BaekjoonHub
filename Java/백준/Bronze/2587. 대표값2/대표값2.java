import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] lst = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(reader.readLine());
            lst[i] = num;
            sum += num;
        }
        Arrays.sort(lst);
        System.out.println(sum / 5);
        System.out.print(lst[2]);
    }
}