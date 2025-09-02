class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int t = n * n;
        int c[] = new int[t + 1];
        for(int[] g : grid){
            for(int i : g){
                c[i]++;
            }
        }
        int r = 0;
        int m = 0;
        for(int j = 1; j <= t; j++){
            if(c[j] == 2){
                r = j;
            }else if(c[j] == 0){
                m = j;
            }
        }
        return new int[] {r, m};
    }
}


/*
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;    // Calculate the size (no.of rows and columns) of the grid
        int t = n * n;    // Since the elements are: n * n with values in the range [1, n^2]
        int c[] = new int[t + 1];    // Create an array to track how many times each number appears
        for(int[] g : grid){    // For each element in the grid:
            for(int i : g){    // For each element in that row:
                c[i]++;    // Increment the count for that value
            }
        }
        int r = 0;    // Variable to store the repeated values
        int m = 0;    // Variable to store the missing values
        for(int j = 1; j <= t; j++){    // For every element in the range from 1 to t:
            if(c[j] == 2){    // If the count is equal to 2:
                r = j;    // It means the number is repeated, so store it in r
            }else if(c[j] == 0){    // If the count is equal to 0:
                m = j;    // It means the number is missing, so store it in m
            }
        }
        return new int[] {r, m};    // Return the final array with both the repeated and missing values
    }
}
*/