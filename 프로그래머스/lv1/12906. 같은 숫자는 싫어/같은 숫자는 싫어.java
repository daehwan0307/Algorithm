import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
      
        Stack<Integer> S = new Stack<>();
        S.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(S.peek()!=arr[i])S.push(arr[i]);
            }
        int[] answer =new int[S.size()];
        for(int i=0;i<S.size();i++){
            answer[i]=S.get(i);
        }
        return answer;
    }
}