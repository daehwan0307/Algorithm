class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] temp = my_string.split("");
        String temp1 = temp[num1];
        temp[num1]=temp[num2];
        temp[num2]=temp1;
         answer = String.join("", temp);
        
        return answer;
    }
}