import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        String[] compare = reader.readLine().split(" ");
        int a = Integer.parseInt(compare[0]);
        int b = Integer.parseInt(compare[1]);

        int M = Integer.parseInt(reader.readLine());
        HashMap<Integer, List<Integer>> lst = new HashMap<>();

        for (int i = 0; i < M; i++) {
            String[] input = reader.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            lst.computeIfAbsent(x, k -> new ArrayList<>()).add(y);
            lst.computeIfAbsent(y, k -> new ArrayList<>()).add(x);
        }

        int result = -1;

        boolean[] check = new boolean[N + 1];
        int[] wanted = new int[N + 1];
//        Deque<Integer> w = new ArrayDeque<>();
        Deque<List<Integer>> q = new ArrayDeque<>();

        check[a] = true;
        for (int i = 0; i < lst.get(a).size(); i++) {
            List<Integer> list = new ArrayList<>();
            list.add(lst.get(a).get(i));
            list.add(1);
            q.add(list);
        }

        while (!q.isEmpty()) {
            List<Integer> que = q.pop();
            int num = que.get(0);
            int cnt = que.get(1);

            if (num == b) {
                result = cnt;
                break;
            }

            if (!check[num]) {
                check[num] = true;
                wanted[num] = cnt;
                for (int i = 0; i < lst.get(num).size(); i++) {
                    List<Integer> list = new ArrayList<>();
                    list.add(lst.get(num).get(i));
                    list.add(cnt + 1);
                    q.add(list);
                }
            }
        }
        System.out.println(result);
    }
}
