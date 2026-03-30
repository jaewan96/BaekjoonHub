class Solution {
    static int answer = 0;
    static boolean[] visit;
    public int solution(int k, int[][] dungeons) {
        // int answer = 0;
        visit = new boolean[dungeons.length];
        
        dfs(k, dungeons, 0);
       
        return answer;
    }
    
    private static void dfs(int k, int[][] dungeons, int num) {
        if (num > answer) {
            answer = num;
        }
        for (int i = 0; i < dungeons.length; i ++) {
            
            if (!visit[i] && k >= dungeons[i][0]) {
                visit[i] = true;
                dfs(k - dungeons[i][1], dungeons, num + 1);
                visit[i] = false;    
            }
            
        }
    }
}