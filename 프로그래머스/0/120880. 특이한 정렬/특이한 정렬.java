import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        List<Integer> list = new ArrayList<>();
        for (int num : numlist) {
            list.add(num);
        }

        list.sort((a, b) -> {
            int distA = Math.abs(a - n);
            int distB = Math.abs(b - n);

            if (distA == distB) {
                return b - a; 
            }
            return distA - distB;
        });

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
