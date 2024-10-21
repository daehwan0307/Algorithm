import java.util.*;
class Solution {
    public int solution(int[] array) {
      
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // 배열을 순회하며 빈도를 기록
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // 최빈값을 찾기 위한 변수
        int maxFrequency = 0;
        int answer = -1;
        boolean multipleModes = false;  // 최빈값이 여러 개인지 여부

        // 빈도수 맵을 순회하며 가장 빈도가 높은 값을 찾음
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                answer = entry.getKey();
                multipleModes = false;  // 새로운 최빈값이 나오면 최빈값이 하나라는 의미
            } else if (frequency == maxFrequency) {
                multipleModes = true;  // 같은 빈도를 가진 숫자가 또 있으면 최빈값이 여러 개
            }
        }
        
        // 최빈값이 여러 개면 -1을 반환
        if (multipleModes) {
            return -1;
        }
        
        return answer;  // 최빈값 반환
    }
}