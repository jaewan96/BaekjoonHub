class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = (int) Math.sqrt(n);
        if (num * num == n) {
            answer += num;
            num -= 1;
        }
        for (int i = 1; i < num+1; i++) {
            if (n % i == 0) {
                answer += i;
                answer += n/i;
            }
        }
        
        return answer;
    }
}