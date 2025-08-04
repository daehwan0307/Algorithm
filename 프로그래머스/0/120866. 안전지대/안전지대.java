class Solution {
    public int solution(int[][] board) {
        int size = board.length;
        int[][] bombmap = new int[size][size];
        int count = 0;

        int[] dx = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 0, 1, -1, 0, 1};

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 1) {
                    for (int d = 0; d < 9; d++) {
                        int nx = i + dx[d];
                        int ny = j + dy[d];
                        if (nx >= 0 && ny >= 0 && nx < size && ny < size) {
                            bombmap[nx][ny] = 1;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (bombmap[i][j] == 0) {
                    count++;
                }
            }
        }

        return count;

    }
}