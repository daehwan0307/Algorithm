import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
    int n = emergency.length;
        
        // 결과를 저장할 배열을 n 길이로 초기화
        int[] result = new int[n];
        
        // 원래 배열의 값을 리스트에 복사 (indexOf 메소드 사용을 위해)
        List<Integer> list = new ArrayList<>();
        for (int num : emergency) {
            list.add(num);
        }
        
        // 원본 배열을 복사하고 정렬하여 우선순위를 쉽게 매길 수 있게 함
        int[] sortedEmergency = Arrays.copyOf(emergency, n);
        Arrays.sort(sortedEmergency);
        
        // 우선순위 순위를 매기기 위한 변수 count 초기화
        int count = 1;
        
        // 정렬된 배열을 뒤에서부터 탐색 (큰 값부터 처리)
        for (int i = n - 1; i >= 0; i--) {
            // 현재 가장 높은 우선순위 요소를 찾음
            int target = sortedEmergency[i];
            
            // 원래 배열에서 이 요소가 어디에 위치했는지 찾아서 결과 배열에 순위를 저장
            result[list.indexOf(target)] = count++;
        }
        
        // 최종적으로 우선순위가 매겨진 결과 배열을 반환
        return result;

    }
}