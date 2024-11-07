class Solution {
    public int solution(int order) {
        int answer = 0;
        while(order >0){
            int clap = order%10;
            
            if(clap==3 || clap ==6 || clap ==9){
                answer = answer+1;
            }
            order = order/10;
        }
        return answer;
    }
}