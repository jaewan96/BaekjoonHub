import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[100][100];

        int n = Integer.parseInt(reader.readLine());
        int result = 0;
                                                   
        for (int k = 0; k < n; k ++) {
            String input = reader.readLine();
            StringTokenizer st = new StringTokenizer(input);
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());
            for (int i = row; i < row + 10; i ++) {
                for (int j = col; j < col + 10; j ++) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < 100; i ++) {
            for (int j = 0; j < 100; j ++) {
                if (arr[i][j] == 1) {
                    result += 1;
                }
            }
        }
        System.out.print(result);
    }
}