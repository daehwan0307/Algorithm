class Solution {
    public int solution(String[] babbling) {
        int ans = 0;
        for (String s : babbling) {
            if (s.matches("^(aya|ye|woo|ma)+$")) ans++;
            //정규식은 gpt 사용
        }
        return ans;
    }
}