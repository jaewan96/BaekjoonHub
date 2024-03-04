import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String alp = br.readLine().toUpperCase();
//        System.out.println(alp);
        int[] count = new int[26];

        for (int i = 0; i < alp.length(); i++) {
            char ch = alp.charAt(i);
            int index = ch - 'A';
            count[index]++;
        }

        int maxN = 0;
        int num = 0;
        int index = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] > maxN) {
                maxN = count[i];
                num = 1;
                index = i;
            } else if (count[i] == maxN) {
                num++;
            }
        }
        if (num > 1) {
            System.out.println("?");
        } else {
            System.out.println((char) ('A' + index));
        }
    }
}
