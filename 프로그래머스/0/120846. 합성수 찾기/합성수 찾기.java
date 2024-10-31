class Solution {
    public int solution(int n) {
        int result = 0;
    for (int i = 4; i <= n; i++) {
            // 각 숫자 i에 대해 2부터 i-1까지의 숫자로 나누어 나머지가 0인 경우를 찾습니다.
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { // i가 j로 나누어 떨어지면
                    result++; // 합성수이므로 결과 값 증가
                    break; // 더 이상 검사할 필요 없이 다음 숫자로 이동
                }
            }
        }
        return result;
    }
}