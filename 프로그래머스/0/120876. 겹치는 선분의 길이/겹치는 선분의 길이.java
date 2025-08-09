class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] paper = new int[200];
        
        for(int i=0;i<3;i++){
           for(int j= lines[i][0]+100; j<lines[i][1]+100; j++){
               paper[j]+=1;
           }
            
        }
        for(int i= 0; i<paper.length; i++){
            if(paper[i]>=2){
                answer +=1;
            }
        }
        return answer;
    }
}