class Solution {
    private int answer = 0;
    public int solution(int[] nums) {
        comb(nums, new int[3], 0, 0);
        return answer;
        
    }
    public void comb(int[] arr, int[] lst, int startIdx, int idxNum) {
        if (idxNum == 3) {
            int sumNums = 0;
            for (int i : lst) {
                sumNums += i;
            }
            int squart = (int)Math.sqrt(sumNums);
            boolean check = true;
            if (sumNums % 2 != 0) {
                for (int j = 3; j <= squart; j++) {
                   if (sumNums % j == 0) {
                       check = false;
                       break;
                   } 
                }
                 if (check == true) {
                    answer += 1;
                }   
            }
            
            return ;
        }
        for (int i = startIdx; i < arr.length; i ++) {
            lst[idxNum] = arr[i];
            comb(arr, lst, i+1, idxNum+1);
        }
    }
    
}