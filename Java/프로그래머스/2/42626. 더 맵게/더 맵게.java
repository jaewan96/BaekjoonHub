import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int sco : scoville) {
            heap.add(sco);
        }
        int first = heap.poll();
        while (first < K) {
            if (heap.isEmpty()) {
                return -1;
            }
            int second = heap.poll();
            int next = first + (second * 2);
            heap.add(next);
            answer ++;
            first = heap.poll();
        }
        return answer;
    }
}