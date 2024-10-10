import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = reader.readLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        
        int[][] matrix1 = new int[row][col];
        for (int i = 0; i < row; i++) {
            String[] line = reader.readLine().split(" ");
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = Integer.parseInt(line[j]);
            }
        }
        
        int[][] matrix2 = new int[row][col];
        for (int i = 0; i < row; i++){
            String[] line = reader.readLine().split(" ");
            for (int j = 0; j < col; j ++) {
                matrix2[i][j] = Integer.parseInt(line[j]);
            }
        }
        
        int[][] result = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j ++) {
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);        
    }
}