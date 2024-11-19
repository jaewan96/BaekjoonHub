import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String alp = reader.readLine();
        Set<String> set = new HashSet<>();
        
        for (int i = 0; i < alp.length(); i ++) {
            for (int j = i+1; j < alp.length()+1 ; j ++) {
                set.add(alp.substring(i, j));
            }
        }
        System.out.print(set.size());
    }
}