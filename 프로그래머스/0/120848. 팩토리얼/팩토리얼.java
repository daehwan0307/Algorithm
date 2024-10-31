class Solution {
    public int solution(int n) {
   int result = 1;
        
        // 곱셈 연산을 위한 변수 초기화
        int num = 1;
        
        // n이 num보다 클 동안 반복
        while (n > num) {
            // 결과 변수 값을 증가시킴
            result++;
            
            // num에 결과값을 곱하여 업데이트
            num *= result;
        }
        
        // n이 num과 같다면 현재 결과값을 반환
        if (n == num) {
            return result;
        }
        
        // n이 num보다 작다면 마지막으로 더 작은 결과값을 반환
        return result - 1;
    }
}