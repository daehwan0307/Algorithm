class Solution {
    public int[][] solution(int[] num_list, int n) {
        
        int total = num_list.length;
        int[][] answer = new int[total/n][n];
        int k = 0;
        for(int i = 0; i<total/n; i++){
            for(int j = 0 ; j <n ;j++){
              
               answer[i][j]= num_list[k];
                 k++;
            }
            
        }
        return answer;
    }
}