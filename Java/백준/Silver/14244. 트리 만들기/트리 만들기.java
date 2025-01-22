import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder result = new StringBuilder();
        int s = 0;
        int e = 1;
        int leaf = m-1;
        result.append(s).append(" ").append(e).append('\n');

        while (leaf > 0) {
            e ++;
            result.append(s).append(" ").append(e).append('\n');
            leaf --;
        }
        s = e;
        e ++;
        while (e < n) {
            result.append(s).append(" ").append(e).append('\n');
            s ++;
            e ++;
        }
        System.out.println(result);
    }
}
