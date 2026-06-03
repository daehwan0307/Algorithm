import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        
        int total = stages.length;
        int[] stageCount = new int[N + 2];
        
        for(int i=0;i<total;i++){
            stageCount[stages[i]]+=1;
        }
        double[] rate = new double [N];
        
        for(int i = 0; i < N; i++){
    if(total == 0){
        rate[i] = 0;
    } else {
        rate[i] = stageCount[i + 1] / (double) total;
    }
    total = total - stageCount[i + 1];
}
        Integer[] idx = new Integer[N];
for(int i = 0; i < N; i++){
    idx[i] = i + 1;  // 1번 ~ N번 스테이지
}

// 2. 실패율 높은 순으로 정렬
Arrays.sort(idx, (a, b) -> Double.compare(rate[b-1], rate[a-1]));

// 3. Integer[] → int[] 변환
answer = new int[N];
for(int i = 0; i < N; i++){
    answer[i] = idx[i];
}
        
        return answer;
    }
}