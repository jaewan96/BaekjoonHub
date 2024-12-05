import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    private static int cnt = 0;
    private static int result = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<Integer> input = new ArrayList<>();

        StringTokenizer st1 = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            input.add(Integer.parseInt(st1.nextToken()));
        }

        merge_sort(input, 0, input.size()-1, K);

        System.out.println(result);
    }

    public static void merge_sort(List<Integer> lst, int p, int r, int K) {
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(lst, p, q, K);
            merge_sort(lst, q + 1, r, K);
            merge(lst, p, q, r, K);
        }
    }

    public static void merge(List<Integer> lst, int p, int q, int r, int K) {
        int i = p;
        int j = q + 1;
        List<Integer> list = new ArrayList<>();
        while (i <= q && j <= r) {
            if (lst.get(i) < lst.get(j)) {
                list.add(lst.get(i++));
            } else {
                list.add(lst.get(j++));
            }
        }
        while (i <= q) {
            list.add(lst.get(i++));
        }
        while (j <= r) {
            list.add(lst.get(j++));
        }

        for (int t = 0; t < list.size(); t++) {
            lst.set(p + t, list.get(t));
            cnt ++;

            if (cnt == K) {
                result = list.get(t);
            }
        }
    }
}