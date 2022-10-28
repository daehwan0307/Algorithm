import java.util.HashSet;
import java.util.Set;
class Solution {
        public int solution(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                set.add(nums[i]);  //중복을 없애기 위해 set을 만듬
            }
            int N = nums.length/2;
            
            if(set.size()< N){
                return set.size();
            }else 
                return N;
        }
    }