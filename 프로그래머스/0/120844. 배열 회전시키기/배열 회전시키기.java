import java.util.*;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int j= 0;
    
        if(direction.equals("right")){
        for(int i = 1; i<numbers.length; i ++)
        {
            
            answer[i] = numbers[j];
            j++;
        }
            answer[0] = numbers[numbers.length-1];
            }else{
            for(int i = 0; i<numbers.length-1; i ++){
                answer[i]= numbers[i+1];
        
            }
            answer[numbers.length-1]= numbers[0];
            
        }
        return answer;
    }
}