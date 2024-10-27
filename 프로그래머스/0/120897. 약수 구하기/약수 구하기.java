import java.util.*;
class Solution {
    public int[] solution(int n) {
 List<Integer> list = new ArrayList<>();
        
        // 1부터 n까지 모든 수를 확인합니다.
        for (int i = 1; i <= n; i++) {
            // i가 n의 약수인지 확인합니다.
            if (n % i == 0) {
                // i가 약수라면 리스트에 추가합니다.
                list.add(i);
            }
        }
        
        // 리스트의 크기만큼의 배열을 초기화합니다.
        int[] result = new int[list.size()];
        
        // 리스트의 요소를 배열로 복사합니다.
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        
        // 약수 배열을 반환합니다.
        return result;
    }

}