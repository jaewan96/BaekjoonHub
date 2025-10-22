import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int cash = Integer.parseInt(reader.readLine());

        int[] price = new int[14];
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < 14; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }

        int bnp = BNP(price, cash);
        int timing = TIMING(price, cash);

        if (bnp > timing) {
            System.out.println("BNP");
        } else if (bnp == timing) {
            System.out.println("SAMESAME");
        } else {
            System.out.println("TIMING");
        }
    }

    public static int BNP(int[] price, int cash) {
        int num = 0;
        int money = cash;

        for (int i = 0; i < 14; i++) {
            num += money / price[i];
            money %= price[i];
        }

        return (num * price[13]) + money;
    }

    public static int TIMING(int[] price, int cash) {
        int num = 0;
        int money = cash;

        int up = 0;
        int down = 0;
        for (int i = 1; i < 14; i++) {
            if (price[i] < price[i - 1]) {
                up = 0;
                down ++;
                if (down >= 3) {
                    num += money / price[i];
                    money %= price[i];
                }
            } else if (price[i] == price[i - 1]) {
                up = 0;
                down = 0;
            } else {
                down = 0;
                up ++;
                if (up > 3) {
                    money += price[i] * num;
                    num = 0;
                }
            }
        }

        return (num * price[13]) + money;
    }
}
