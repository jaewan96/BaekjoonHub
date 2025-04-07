import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        String[] r = reader.readLine().split(" ");
        int[] road = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            road[i] = Integer.parseInt(r[i]);
        }

        String[] o = reader.readLine().split(" ");
        int[] oil = new int[N];
        for (int i = 0; i < N; i++) {
            oil[i] = Integer.parseInt(o[i]);
        }

        long price = (long) oil[0] * road[0];
        int idx = 0;
        for (int i = 1; i < N-1; i++) {
            if (oil[i] < oil[idx]) {
                price += (long) oil[i] * road[i];
                idx = i;
            } else {
                price += (long) oil[idx] * road[i];
            }
        }
        System.out.println(price);
    }
}
