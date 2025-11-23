class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        String temp = A;
        for(int i = 0 ; i < A.length() ; i++){
            if(temp.equals(B)){
                answer = i;
                break;
            }
            temp = temp.charAt(A.length()-1) + temp.substring(0, A.length()-1);

        }
        return answer;
    }
}