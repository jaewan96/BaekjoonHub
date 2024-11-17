import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        Set<String> set = new HashSet<>();
        
        for (int i = 0; i < N; i ++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            
            String name = st.nextToken();
            String record = st.nextToken();
            if (record.equals("enter")){
                set.add(name);
            } else if (record.equals("leave") && set.contains(name)) {
                set.remove(name);
            }
        }
        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        for (String result : list) {
            System.out.println(result);
        }
    }
}