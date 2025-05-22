class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int r = arr1.length;
        int m = arr1[0].length;
        int c = arr2[0].length;
        
        int[][] answer = new int[r][c];
        for (int i = 0; i < r; i ++){
            
            for (int j = 0; j < c; j ++) {
                int num = 0;
                for (int k = 0; k < m; k++) {
                    num += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = num;
            }
        }
        return answer;
    }
}