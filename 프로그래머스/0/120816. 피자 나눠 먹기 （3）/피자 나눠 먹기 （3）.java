class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        for(int i = 1; n>slice*i;i++){
            answer = answer+1;
        }
        return answer;
    }
}