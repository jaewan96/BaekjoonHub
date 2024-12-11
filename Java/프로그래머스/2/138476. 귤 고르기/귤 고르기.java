import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int tan : tangerine) {
            list.add(tan);
        }
        Collections.sort(list);
        List<Integer> count = new ArrayList<>();
        int num = list.get(0);
        int cnt = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == num) {
                cnt += 1;
            } else {
                count.add(cnt);
                cnt = 1;
                num = list.get(i);
            }
        }
        count.add(cnt);
        Collections.sort(count, Collections.reverseOrder());
        int plus = 0;
        for (int c : count) {
            if (plus >= k) {
                return answer;
            }
            plus += c;
            answer ++;
        }
        return answer;
    }
}