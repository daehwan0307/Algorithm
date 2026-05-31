import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
  
        int counta =0;
        int countb = 0;
        int countc = 0;
        
        int[][] supo= {
            {1,2,3,4,5},
            {2,1,2,3,2,4,2,5},
            {3,3,1,1,2,2,4,4,5,5}
        };
        
        for(int j = 0; j < answers.length; j++){
    if(supo[0][j % supo[0].length] == answers[j]) counta++;
    if(supo[1][j % supo[1].length] == answers[j]) countb++;
    if(supo[2][j % supo[2].length] == answers[j]) countc++;
}
        
        
        
      int max = Math.max(counta,Math.max(countb,countc));
    List<Integer> list = new ArrayList<>();

if(counta == max) list.add(1);
if(countb == max) list.add(2);
if(countc == max) list.add(3);

        
        
        
        int[] answer = new int[list.size()];
for(int i = 0; i < list.size(); i++){
    answer[i] = list.get(i);
}
return answer;
    }
}