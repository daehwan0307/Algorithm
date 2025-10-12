class Solution {

    private int toSec(String time) {
        String[] parts = time.split(":");
        int mm = Integer.parseInt(parts[0]);
        int ss = Integer.parseInt(parts[1]);
        return mm * 60 + ss;
    }

    
    private String toTime(int totalSec) {
        int mm = totalSec / 60;
        int ss = totalSec % 60;
        return String.format("%02d:%02d", mm, ss);
    }

    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLen = toSec(video_len);
        int curPos   = toSec(pos);
        int opStart  = toSec(op_start);
        int opEnd    = toSec(op_end);

       
        if (curPos >= opStart && curPos <= opEnd) {
            curPos = opEnd;
        }

        for (String cmd : commands) {
            if (cmd.equals("prev")) {
                curPos = Math.max(curPos - 10, 0);
            } else { 
                curPos = Math.min(curPos + 10, videoLen);
            }
       
            if (curPos >= opStart && curPos <= opEnd) {
                curPos = opEnd;
            }
        }

        return toTime(curPos);
    }
}