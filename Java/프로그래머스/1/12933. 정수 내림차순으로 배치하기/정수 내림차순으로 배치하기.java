import java.util.Arrays;
class Solution {
    public long solution(long n) {
        String num = String.valueOf(n);
        char[] charArray = num.toCharArray();
        Arrays.sort(charArray);
        StringBuilder sortedArray = new StringBuilder(new String(charArray)).reverse();
        long answer = Long.parseLong(sortedArray.toString());
        return answer;
    }
}