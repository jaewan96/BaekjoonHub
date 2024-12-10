import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int person = 0;
        boolean alive = true;
        char lastAlp = words[0].charAt(words[0].length() -1);
        
		HashSet<String> set = new HashSet<>();
        set.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (set.contains(words[i])) {
                alive = false;
                person = i+1;
                break;
            }
            char firstAlp = words[i].charAt(0);
            if (firstAlp != lastAlp) {
                alive = false;
                person = i+1;
                break;
            }
            lastAlp = words[i].charAt(words[i].length()-1);
            set.add(words[i]);
        }
        if (alive) {
            answer[0] = 0;
            answer[1] = 0;
        } else {
            if (person % n == 0) {
                answer[0] = n;
                answer[1] = person/n;
            } else {
                answer[0] = person % n;
                answer[1] = person/n +1;
            }
        }
        return answer;
    }
}