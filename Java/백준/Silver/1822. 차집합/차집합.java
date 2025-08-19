import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        String[] aAtom = reader.readLine().split(" ");
        String[] bAtom = reader.readLine().split(" ");

        int[] aArray = new int[aAtom.length];
        int[] bArray = new int[bAtom.length];

        for (int i = 0; i < aAtom.length; i++) {
            aArray[i] = Integer.parseInt(aAtom[i]);
        }

        for (int i = 0; i < bAtom.length; i++) {
            bArray[i] = Integer.parseInt(bAtom[i]);
        }

        Arrays.sort(aArray);
        Arrays.sort(bArray);

        int cnt = aArray.length;
        StringBuilder atom = new StringBuilder();
        for (int i = 0; i < aArray.length; i++) {
            int target = aArray[i];

            boolean check = true;
            int s = 0;
            int e = bArray.length - 1;

            while (s <= e) {
                int mid = (e + s) / 2;

                if (bArray[mid] > target) {
                    e = mid - 1;
                } else if (bArray[mid] < target) {
                    s = mid + 1;
                } else {
                    cnt --;
                    check = false;
                    break;
                }
            }

            if (check) {
                atom.append(target).append(" ");
            }
        }

        if (cnt == 0) {
            System.out.println(0);
        } else {
            System.out.println(cnt);
            System.out.println(atom);
        }
    }
}
