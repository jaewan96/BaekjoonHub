import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int[][] matrix = new int[9][9];
        for (int i =0; i < 9; i++) {
            String[] arr = reader.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = Integer.parseInt(arr[j]);
            }
        }
        
        int maxNum = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (matrix[i][j] > maxNum) {
                    maxNum = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(maxNum);
        System.out.println((row+1) + " " + (col+1));
    }
}