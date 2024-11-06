import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int[] lst = new int[3];
        for (int i = 0; i < 3; i ++) {
            lst[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(lst);
        System.out.print(lst[1]);
      
    }
}