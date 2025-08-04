class Solution {
    public int solution(int[] sides) {
          int answer = 0;
        int max = Math.max(sides[0], sides[1]);

        //max값이 max인 경우
        int case1 = 0;
        int case2 =0;
        
        case1 = Math.min(sides[0], sides[1]) -1;
        case2 = Math.min(sides[0], sides[1]);
        answer = case1 + case2;
        return answer;
    }
}