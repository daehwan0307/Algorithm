import java.util.*;
class Solution {
   public int solution(int n, int[] lost, int[] reserve) {
        int count = 0; // 빌려받은 사람 수
        Set<Integer> set = new HashSet<>();
        for (int r : reserve) set.add(r);

       
        List<Integer> realLost = new ArrayList<>();
        for (int l : lost) {
            if (set.contains(l)) {
                set.remove(l); // 자기 여분 사용
            } else {
                realLost.add(l); // 진짜로 잃어버린 사람만 남김
            }
        }


        Collections.sort(realLost);
        for (int l : realLost) {
            if (set.contains(l - 1)) {
                set.remove(l - 1);
                count++;
            } else if (set.contains(l + 1)) {
                set.remove(l + 1);
                count++;
            }
        }

 
        return n - (realLost.size() - count);
    }
}