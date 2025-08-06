class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
       for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {


                for (int k = 0; k < dots.length; k++) {
                    for (int l = k + 1; l < dots.length; l++) {

                        if (i == k || i == l || j == k || j == l) continue;

                        if (check(dots[i], dots[j], dots[k], dots[l])) {
                            return 1;
                        }
                    }
                }
            }
        }
        
        return 0;
    }
    
    public boolean check(int[] a, int[] b, int[] c, int[] d) {
        return (b[1] - a[1]) * (d[0] - c[0]) == (d[1] - c[1]) * (b[0] - a[0]);
    }
    
}