class Solution {
    public boolean solution(int x) {

        int hap = 0;
        boolean answer = true;
        int a =x;
        while (a >= 1) {
            hap += a % 10;
            a /= 10;
        }


        if(x%hap==0){
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }
}