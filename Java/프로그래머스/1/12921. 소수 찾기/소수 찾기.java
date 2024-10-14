class Solution {
    public int solution(int n) {
        int answer = 1;
        for (int i = 3; i <= n; i++) {
            if (i % 2 != 0) {
                int k = (int)Math.sqrt(i);
                boolean num = true;
                for (int j = 3; j <= k; j++) {
                    if (i % j == 0) {
                        num = false;
                        break;
                    }
                }
                if (num == true) {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}