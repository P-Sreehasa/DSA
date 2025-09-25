class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int t = 0;
        int f = 0;
        int s = 0;
        for(int  i = 0; i < n; i++){
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


/*
class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;    // Calculate the size of the grid
        int t = 0;    // Counter for the top-view's area
        int f = 0;    // Counter for the front-view's area
        int s = 0;    // Counter for the side-view's area
        for(int  i = 0; i < n; i++){    // For each row:
            int r = 0;    // Calculate the maximum hegighrt in the current row
            int c = 0;    // Calculate the maximum height in the current column
            for(int j = 0; j < n; j++){    // For each column in the current row:
                if(grid[i][j] > 0){    // If there is a cube at i,j position:
                    t++;    // Increment the top value
                }
                r = Math.max(r, grid[i][j]);    // Calculate the maximum value in the row
                c = Math.max(c, grid[j][i]);    // Calculate the maximum value in the column
            }
            s += r;    // Add the maximum height in row-i to the side-view
            f += c;    // Add the maximum height in column-i to the front-view
        }
        return t + f + s;    // Return the final value as the sum of all 3 projections
    }
}
*/