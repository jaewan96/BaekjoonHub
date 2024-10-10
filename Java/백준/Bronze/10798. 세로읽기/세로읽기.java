import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        List<String> matrix = new ArrayList<>();
        String lines;
        
        while ((lines = reader.readLine()) != null && !lines.isEmpty()) {
            matrix.add(lines);
        }
        
        int maxLength = 0;
        for (String line : matrix) {
            if (line.length() > maxLength) {
                maxLength = line.length();
            }
        }
        
        for (int j = 0; j < maxLength; j++) {
            for (int i =0; i < matrix.size(); i++) {
                if (j < matrix.get(i).length()) {
                    System.out.print(matrix.get(i).charAt(j));   
                }
            }
        }
    }
}