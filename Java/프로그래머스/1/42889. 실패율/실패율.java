import java.util.*;
class Rate {
    int round;
    double failRate;
    
    public Rate(int round, double failRate) {
        this.round = round;
        this.failRate = failRate;
    }
}
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] count = new int[N+1];
        int person = stages.length;
        for (int stage : stages) {
            count[stage-1] ++;
}
        List<Rate> rate = new ArrayList<>();
        for (int i = 1; i < N+1; i++) {
            double failRate = 0;
            if (person > 0) {
                failRate = (double)count[i-1] / person;
            }
            
            rate.add(new Rate(i, failRate));
            person -= count[i-1];
        }
        Collections.sort(rate, (a, b) -> {
            if (a.failRate == b.failRate) {
                return Integer.compare(a.round, b.round);
            } else {
                return Double.compare(b.failRate, a.failRate);
            }
        });
             for (int i = 0; i < rate.size(); i++) {
            answer[i] = rate.get(i).round;
        }
        return answer;
    }
}