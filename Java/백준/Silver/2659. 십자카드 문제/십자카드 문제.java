import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        int num = 100000;
        int x1 = Integer.parseInt(input[0]);
        int x2 = Integer.parseInt(input[1]);
        int x3 = Integer.parseInt(input[2]);
        int x4 = Integer.parseInt(input[3]);

        num = Math.min(num, x1 * 1000 + x2 * 100 + x3 * 10 + x4);
        num = Math.min(num, x2 * 1000 + x3 * 100 + x4 * 10 + x1);
        num = Math.min(num, x3 * 1000 + x4 * 100 + x1 * 10 + x2);
        num = Math.min(num, x4 * 1000 + x1 * 100 + x2 * 10 + x3);
        int cnt = 0;


        Set<Integer> set = new TreeSet<>();

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int x = 1; x <= 9; x++) {
                    for (int y = 1; y <= 9; y++) {
                        int min = 10000;
                        min = Math.min(min, i * 1000 + j * 100 + x * 10 + y);
                        min = Math.min(min, j * 1000 + x * 100 + y * 10 + i);
                        min = Math.min(min, x * 1000 + y * 100 + i * 10 + j);
                        min = Math.min(min, y * 1000 + i * 100 + j * 10 + x);

                        set.add(min);
                    }
                }
            }
        }

        for (int number : set) {
            if (num == number) {
                cnt ++;
                break;
            }
            cnt ++;
        }
        System.out.println(cnt);

    }
}
