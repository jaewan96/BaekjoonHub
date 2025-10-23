import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[][] bingo = new int [26][2];
        HashMap<Integer, List<Integer>> call = new HashMap<>();

        int[] rowCnt = new int[5];
        int[] colCnt = new int[5];
        int lefDia = 0;
        int rigDia = 0;

        for (int i = 0; i < 5; i++) {
            String[] input = reader.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                int num = Integer.parseInt(input[j]);
                bingo[num][0] = i;
                bingo[num][1] = j;
            }
        }

        boolean complete = false;
        int result = 0;

        for (int i = 0; i < 5; i++) {
            String[] input = reader.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                int n = Integer.parseInt(input[j]);

                if (!complete) {
                    int cnt = 0;
                    int x = bingo[n][0];
                    int y = bingo[n][1];
                    rowCnt[x]++;
                    colCnt[y]++;
                    if (x == y) {
                        lefDia ++;
                    }
                    if (x + y == 4) {
                        rigDia ++;
                    }

                    for (int k = 0; k < 5; k++) {
                        if (colCnt[k] == 5) {
                            cnt ++;
                        }
                        if (rowCnt[k] == 5) {
                            cnt ++;
                        }
                    }

                    if (lefDia == 5) {
                        cnt ++;
                    }

                    if (rigDia == 5) {
                        cnt ++;
                    }

                    if (cnt >= 3) {
                        complete = true;
                        result = 5 * i + j+1;
                    }
                }
            }
        }

        System.out.println(result);


    }

}
