class Solution {
    public String solution(String rsp) {
       
        String answer ="";
        for(int i = 0; i<rsp.length() ; i++){
            if(rsp.charAt(i)=='2'){    
            answer = answer+"0";
            }else if(rsp.charAt(i)=='0'){
                answer=answer+"5";
            }else{
                answer = answer +"2";
            }
        }
        
        return answer;
    }
}