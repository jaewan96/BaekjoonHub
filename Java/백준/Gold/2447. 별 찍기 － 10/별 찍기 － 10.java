import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        String[][] matrix = new String[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = "*";
            }
        }
        String[][] array = def(matrix, N, N);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i != 0) {
                result.append("\n");
            }
            for (int j = 0; j < N; j++) {
                result.append(matrix[i][j]);
            }
        }
        System.out.println(result);
    }

    public static String[][] def(String[][] arr, int num, int n) {
        int k = num / 3;
        int cnt = k;
        if (k > 0) {
            int row = 1;

            while (cnt < n) {
                if (row % 3 == 1) {
                    row += 1;
                    for (int i = cnt; i < cnt + k; i++) {
                        int colNum = k;
                        int col = 1;
                        while (colNum < n) {
                            if (col % 3 == 1) {
                                for (int j = colNum; j < colNum + k; j++) {
                                    arr[i][j] = " ";
                                }
                                col += 1;
                                colNum += k;
                            } else {
                                col += 1;
                                colNum += k;
                            }

                        }

                    }
                    cnt += k;
                } else {
                    row += 1;
                    cnt += k;
                }
            }
            return def(arr, k, n);
        }
        return arr;
    }
}
