class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        if(2*(k-1)<numbers.length){
            answer = numbers[2*(k-1)];
        }else {
          answer = numbers[2*(k-1)%numbers.length];
        }
        
        
        return answer;
    }
}