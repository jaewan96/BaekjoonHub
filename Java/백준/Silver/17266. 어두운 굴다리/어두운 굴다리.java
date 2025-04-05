import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        boolean[] lst = new boolean[N+1];

        StringTokenizer st = new StringTokenizer(reader.readLine());
        int cnt = 0;
        int idx = 0;
        for (int i = 0; i < M; i++) {
            int x = Integer.parseInt(st.nextToken());
            lst[x] = true;
            if (i == 0) {
                cnt = x;
            } else {
                int num = 0;
                if ((x - idx) % 2 != 0) {
                    num = (x - idx) / 2 +1;
                } else {
                    num = (x - idx) / 2;
                }

                if (cnt < num) {
                    cnt = num;
                }
            }
            idx = x;
        }
        if (cnt < N - idx) {
            cnt = N - idx;
        }
        System.out.println(cnt);


    }
}
