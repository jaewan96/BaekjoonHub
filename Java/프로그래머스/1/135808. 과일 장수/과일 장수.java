import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] scores = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scores, Collections.reverseOrder());
        for (int i = m-1; i < score.length; i += m) {
            answer += scores[i] * m;
}
        return answer;
    }
}