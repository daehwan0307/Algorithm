class Solution {
    public String solution(String my_string) {
    
        
        System.out.println(my_string.replace("b","c"));
        String answer = my_string.replace("i","");
        answer = answer.replace("a","");
        answer = answer.replace("e","");
        answer= answer.replace("o","");
        answer= answer.replace("u","");
        return answer;
    
    }
}