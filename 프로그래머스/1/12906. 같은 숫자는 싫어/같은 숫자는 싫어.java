import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> st = new Stack<>();
        
        st.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                st.push(arr[i]);
            }
        }
        answer = new int[st.size()];
        for(int i = answer.length - 1; i >= 0; i--){
            answer[i] = st.pop();
        }
      

        return answer;
    }
}