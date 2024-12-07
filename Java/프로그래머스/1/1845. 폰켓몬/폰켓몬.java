import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int cnt = set.size();
        if (count < cnt) {
            answer = count;
        } else {
            answer = cnt;
        }
        
        return answer;
    }
}