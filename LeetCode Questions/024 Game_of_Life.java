class Solution {
    public void gameOfLife(int[][] board) {
        int R=board.length;
        int C=board[0].length;
        int[][] copyBoard = new int[R][C];
        
        for(int i=0; i<R; i++)
            for(int j=0; j<C; j++)
                copyBoard[i][j] = board[i][j];
        int[] dx = {1,1,0,-1,-1,-1,0,1};
        int[] dy = {0,1,1,1,0,-1,-1,-1};
        
        for(int i=0; i<R; i++) {
            for(int j=0; j<C; j++) {
                int liveCounts=0;
                for(int k=0; k<8; k++)
                    if(isSafe(i+dx[k],j+dy[k],R,C) && copyBoard[i+dx[k]][j+dy[k]]==1)
                        liveCounts++;
                if(copyBoard[i][j]==0 && liveCounts==3)
                    board[i][j]=1;
                if(board[i][j]==1 && (liveCounts<2 || liveCounts>3))
                    board[i][j]=0;
            }
        }
    }
        private boolean isSafe(int x, int y, int R, int C) {
            return (x>=0 && x<R && y>=0 && y<C);
    }
}
