import java.util.*;
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String [] list = my_string.split("");
        
        for(int i =0; i<my_string.length(); i++){
            for(int j = 0 ; j<n;j++){
                answer = answer +list[i];
            }
        }
        return answer;
    }
}