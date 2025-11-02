class Solution {
    public String solution(String bin1, String bin2) {
        
        int one = Integer.parseInt(bin1,2);
        int two = Integer.parseInt(bin2,2);
        
        int temp = one + two;
        
        
        String answer = Integer.toBinaryString(temp);
        return answer;
    }
}