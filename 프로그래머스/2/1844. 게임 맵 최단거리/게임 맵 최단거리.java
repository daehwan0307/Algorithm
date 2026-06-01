import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        
        int[] dx = { -1,1,0,0};
        int[] dy = {0,0,-1,1,};
        
         int[][] dist = new int[n][m];
        
        Queue<int[]> queue = new LinkedList<>();
        
         queue.offer(new int[]{0, 0});   // 시작점
        dist[0][0] = 1; 
        
        while(!queue.isEmpty()){
             int[] cur = queue.poll();
            int x = cur[0], y = cur[1];
            
            for(int d = 0; d < 4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                // 1. 범위 체크
                if(nx<0 || ny<0 || nx>n-1 || ny>m-1) continue;
                
                // 2. 벽이거나 이미 방문한 곳
                if(maps[nx][ny]==0 || dist[nx][ny]!=0) continue;
                
                // 3. 거리 저장 + queue에 추가
               dist[nx][ny] = dist[x][y] + 1;
                queue.offer(new int[]{nx, ny});
            }
        }
        
        
        
        return dist[n-1][m-1] == 0 ? -1 : dist[n-1][m-1];
    }
}