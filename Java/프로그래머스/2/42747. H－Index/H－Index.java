import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int citation : citations) {
            list.add(citation);
        }
        
        Collections.sort(list, Collections.reverseOrder());
       
        int idx = 0;
        int len = list.size();
        while (idx < len) {
            int Hidx = list.get(idx);
            if (Hidx >= idx+1) {
                answer = idx+1;
                idx ++;
            } else {
                break;
            }
        }
        return answer;

    }
}