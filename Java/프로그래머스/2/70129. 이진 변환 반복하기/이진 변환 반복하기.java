import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        List<Integer> lst = new ArrayList<>();
        for (char c : s.toCharArray()) {
            lst.add(c - '0');
        }
        int cnt = 0;
        int zero = 0;
        while (lst.size() > 1) {
            zero += Collections.frequency(lst, 0);
            int len = Collections.frequency(lst, 1);
            lst.clear();
            while (len > 0) {
                lst.add(len % 2);
                len /= 2;
            }
            
            Collections.reverse(lst);
            cnt += 1;
        }
        answer[0] = cnt;
        answer[1] = zero;
        return answer;
    }
}