class Solution {
    public int[] solution(int start_num, int end_num) {
        int len = start_num - end_num +1;
        int[] answer = new int[len];
        
        int i= 0;
        int j = start_num;
        while( i<len){
            answer[i++] = j--;
        }
        
        return answer;
    }
}