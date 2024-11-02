import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0 ; i < N ; i++) {
            int num = Integer.parseInt(reader.readLine());
            list.add(num);
        }
        Collections.sort(list);
        
        for (int i = 0; i < N; i++){
            System.out.println(list.get(i));
        }
    }
}