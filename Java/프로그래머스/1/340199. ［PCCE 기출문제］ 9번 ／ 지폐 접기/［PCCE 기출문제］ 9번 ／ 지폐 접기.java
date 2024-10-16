class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        boolean result = true;
        while (result) {
            if ((wallet[0] >= bill[0] && wallet[1] >= bill[1]) || (wallet[1] >= bill[0] && wallet[0] >= bill[1])) {
                return answer;
             
            } else {
                if (bill[0] > bill[1]) {
                    bill[0] /= 2;
                } else {
                    bill[1] /= 2;
                }
                answer += 1;
            }
        }
        return answer;
    }
}