class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int t = 0;
        int f = 0;
        int s = 0;
        for(int i = 0; i < n; i++){
            int r = 0;
            int c = 0;
            for(int j = 0; j < n; j++){
                if(grid[i][j] > 0){
                    t++;
                }
                r = Math.max(r, grid[i][j]);
                c = Math.max(c, grid[j][i]);
            }
            s += r;
            f += c;
        }
        return t + f + s;
    }
}

