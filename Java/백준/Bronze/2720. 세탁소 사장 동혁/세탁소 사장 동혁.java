import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int coin = Integer.parseInt(br.readLine());

            if (coin / 25 > 0) {
                System.out.print(coin / 25 + " ");
                coin = coin % 25;
            } else {
                System.out.print(0 + " ");
            }

            if (coin / 10 > 0) {
                System.out.print(coin / 10 + " ");
                coin = coin % 10;
            } else {
                System.out.print(0 + " ");
            }

            if (coin / 5 > 0) {
                System.out.print(coin / 5 + " ");
                coin = coin % 5;
            } else {
                System.out.print(0 + " ");
            }
            System.out.println(coin);
        }
    }
}
