class Solution {
    public int solution(int n) {
        int answer = 1;
        
        for(int i = 1; (6*i)%n !=0 ;i++)
        {
            answer = answer +1;
        }
        
        return answer;
    }
}