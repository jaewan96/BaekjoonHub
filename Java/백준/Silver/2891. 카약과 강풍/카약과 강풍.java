import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int S = Integer.parseInt(input[1]);
        int R = Integer.parseInt(input[2]);

        int[] broken = new int[S];
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < S; i++) {
            broken[i] = Integer.parseInt(st.nextToken());
        }


        int[] overPlus = new int[R];
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < R; i++) {
            overPlus[i] = Integer.parseInt(st.nextToken());
        }

        boolean[] brok = new boolean[N+2];
        boolean[] plus = new boolean[N+2];

        for (int i = 0; i < S; i++) {
            brok[broken[i]] = true;
        }

        for (int i = 0; i < R; i++) {
            plus[overPlus[i]] = true;
        }

        for (int i = 0; i <= N; i++) {
            if (brok[i] && plus[i]) {
                brok[i] = false;
                plus[i] = false;
            }
        }

        int cnt = 0;

        Arrays.sort(broken);

        for (int i = 0; i < S; i++) {
            int n = broken[i];
            if (brok[n]) {
                if (plus[n - 1]) {
                    plus[n - 1] = false;
                } else if (plus[n + 1]) {
                    plus[n + 1] = false;
                } else {
                    cnt ++;
                }
            }

        }
        System.out.println(cnt);
    }
}
