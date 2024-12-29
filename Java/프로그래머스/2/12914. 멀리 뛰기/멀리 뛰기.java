import java.util.*;
class Solution {
    
    public long solution(int n) {
   
        int[] dp = new int[2001];
        dp[1] = 1;
        dp[2] = 2;
        int s = 2;
        while (s < n) {
            s ++;
            dp[s] = (dp[s-1] + dp[s-2]) % 1234567;
        }
        long answer = dp[n];
        return (answer);
    }

}