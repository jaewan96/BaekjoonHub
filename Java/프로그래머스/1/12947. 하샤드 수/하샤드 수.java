class Solution {
    public boolean solution(int x) {
        int number = 0;
        int num = x;
        while (num > 0) {
            number += num % 10;
            num /= 10;
        }
        if (x % number == 0) {
            return true;
        } else {
        	return false;
        }
    }
}