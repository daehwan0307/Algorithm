import java.util.*;
class Solution {
    public int solution(String message) {
        int answer = 0;
        String[] list = message.split("");
        answer = 2*list.length;
        return answer;
    }
}