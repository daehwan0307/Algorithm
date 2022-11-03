import java.util.Arrays;
class Solution {
    public int solution(int N) {
        if (N == 2) return 1;
        int[] nums = new int[N-1]; 
        boolean[] checks = new boolean[nums.length]; 
        Arrays.fill(checks, true); 
        for (int i = 0; i < nums.length; i++) nums[i] = i + 2; // 2~49까지 nums에 채우기

        for (int j = 0; j * j <= N; j++) {// N == 49
            int multipleOf = nums[j]; // j=0 nums[0] = 2
            // 초항이 2 2n인 2 4 6 8 10
            for (int i = nums[j] + j; i < nums.length; i+=multipleOf) {
                checks[i] = false;
            }
//            printNums(nums, checks);
        }
        int cnt = 0;
        for (int i = 0; i < checks.length; i++) {
            if(checks[i]) cnt++;
        }
        return cnt;
    }
}