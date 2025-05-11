class Solution {
    public String solution(String s) {
        char[] charArray = s.toLowerCase().toCharArray();
        
        StringBuilder answer = new StringBuilder();
        answer.append(Character.toUpperCase(charArray[0]));
        
        for (int i = 1; i < charArray.length; i++) {
            char left = charArray[i-1];
            char now = charArray[i];
            
            if (Character.isWhitespace(left) && !Character.isWhitespace(now)) {
                now = Character.toUpperCase(now);
            }
            answer.append(now);
        }        

        return answer.toString();
    }
}