class Solution {
    int solution(int[][] land) {
        int answer = 0;
		int row = land.length;
        int[] arr = land[0];
        
        for (int i = 1; i < row; i ++) {
            int[] current = new int[4];
            for (int j = 0; j < 4; j ++) {
                current[j] = land[i][j] + Math.max(arr[(j+1) % 4], Math.max(arr[(j+2) % 4], arr[(j+3) % 4]));
            }
            arr = current;
        }
        answer = Math.max(Math.max(arr[0], arr[1]), Math.max(arr[2], arr[3]));
        
        return answer;
    }
    
}