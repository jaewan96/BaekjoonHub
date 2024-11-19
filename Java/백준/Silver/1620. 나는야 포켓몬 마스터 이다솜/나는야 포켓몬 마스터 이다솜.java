import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> mapName = new HashMap<>();
        HashMap<Integer, String> mapNumber = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String name = reader.readLine();
            mapName.put(name, i+1);
            mapNumber.put(i+1, name);
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < M; i++) {
            if (i > 0) {
                result.append("\n");
            }
            String input = reader.readLine();
            if (Character.isDigit(input.charAt(0))) {
                result.append(mapNumber.get(Integer.parseInt(input)));
            } else {
                result.append(mapName.get(input));
            }
        }
        System.out.println(result);
    }
}