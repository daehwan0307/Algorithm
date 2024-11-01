class Solution {
    public String solution(String my_string) {
        String result = "";
        for(int i=0; i<my_string.length(); i++){
     String s = "" + my_string.charAt(i);
            
            // 결과 문자열에 현재 문자가 포함되어 있지 않으면 추가
            if (!result.contains(s)) {
                result += s;
            }
            // answer = answer + my_string.charAt(i);
        }
        return result;
    }
}