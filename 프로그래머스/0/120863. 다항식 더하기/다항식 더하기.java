class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        String[] str = polynomial.split(" ");
        int num = 0;
        int x_num = 0;

        for(String s : str){
            if(s.contains("x")){
                if(s.length() == 1) { 
                    x_num++;
                }
                else {
                    s = s.replace("x", "");
                    x_num += Integer.valueOf(s);
                }
            }
            else if(s.equals("+")){
                continue;
            }
            else{
                num += Integer.valueOf(s);
            }
        }

        if (x_num > 0) {
            if (x_num == 1) {
                answer += "x";
            } else {
                answer += x_num + "x";
            }
        }
        if (num > 0) {
            if (x_num > 0) { 
                answer += " + " + num;
            } else { 
                answer += num;
            }
        }
        return answer;
    }
}