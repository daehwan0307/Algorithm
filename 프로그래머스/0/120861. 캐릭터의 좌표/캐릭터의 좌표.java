class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] ans = {0, 0};                            
        int maxWidth=board[0]/2;                       
        int maxLength=board[1]/2;                      
        for (int i = 0; i < keyinput.length; i++) {
            if(keyinput[i].equals("left")) {  
                
                ans[0]-= (ans[0]>-(maxWidth)?1:0);  
                
            } else if(keyinput[i].equals("right")) { 
                
                ans[0]+= (ans[0]<(maxWidth)?1:0);
                
            } else if(keyinput[i].equals("down")) {
                
                ans[1]-= (ans[1]>-(maxLength)?1:0);
                
            } else if(keyinput[i].equals("up")) {
                
                ans[1]+= (ans[1]<(maxLength)?1:0);
                
            }
         }
        return ans;
    }
}
