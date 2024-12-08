import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int person : people) {
            list.add(person);
        }
        Collections.sort(list);
        int start = list.size()-1;
        int end = 0;
        
        while (start >= end) {
            int person = list.get(start);
            int small = list.get(end);
            if (person + small <= limit) {
                start --;
                end ++;
                answer ++;
            } else {
                start --;
                answer ++;
            }
        }
        return answer;
    }
}