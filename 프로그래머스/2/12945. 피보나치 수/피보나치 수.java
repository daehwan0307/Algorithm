class Solution {
    public int solution(int n) {
        int[] fivo = new int[n + 1];
        fivo[0] = 0;
        fivo[1] = 1;
        for (int i = 2; i < fivo.length; i++) { 
            fivo[i] = (fivo[i - 1] + fivo[i - 2]) % 1234567;
        }
        return fivo[n];
    }
}