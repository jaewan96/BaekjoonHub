class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        int num = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }

        return answer;
    }
    public static int gcd(int n, int m) {
        while (m != 0) {
            int remain = n % m;
            n = m;
            m = remain;
        }
        return n;
    }
    
    public static int lcm (int n, int m) {
        return n * (m / gcd(n, m));
    }
}