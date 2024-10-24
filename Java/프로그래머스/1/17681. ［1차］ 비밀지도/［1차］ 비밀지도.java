class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i ++) {
            String num1 ="" ;
            for (int j =0; j < n; j ++) {
                if (arr1[i] % 2 == 0 && arr2[i] % 2 == 0) {
                    num1 = " " + num1;
                } else {
                    num1 = "#" + num1;
                }
                arr1[i] /= 2;
                arr2[i] /= 2;
            }
            answer[i] = num1;
        }
        return answer;
    }
}