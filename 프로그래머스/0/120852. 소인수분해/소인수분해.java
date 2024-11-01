import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>(); // 소인수를 저장할 리스트
        
        // n이 1보다 큰 동안 반복하여 소인수 분해
        while (n > 1) {
            for (int i = 2; i <= n; i++) { // 2부터 시작하여 n을 나눌 수 있는 최소 소수를 찾음
                if (n % i == 0) { // n이 i로 나누어 떨어지면
                    n /= i; // n을 i로 나누어 줌
                    if (!list.contains(i)) { // 리스트에 없는 소인수라면 추가
                        list.add(i);
                    }
                    break; // 나누어 떨어지면 반복문을 종료하고 다음 소인수를 찾음
                }
            }
        }
        
        int[] result = new int[list.size()]; // 결과를 저장할 배열 생성
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i); // 리스트의 값을 배열로 복사
        }
        
        return result; // 결과 배열 반환
    }
}