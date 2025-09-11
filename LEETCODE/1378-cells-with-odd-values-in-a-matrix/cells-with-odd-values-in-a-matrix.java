class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int r[] = new int[m];
        int c[] = new int[n];
        for(int[] i : indices){
            r[i[0]]++;
            c[i[1]]++;
        }
        int cnt = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if((r[i] + c[j]) % 2 != 0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}


/*
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int r[] = new int[m];    // Declare an array of size m for rows
        int c[] = new int[n];    // Declare an array of size n for columns
        for(int[] i : indices){    // For each value in the indices array:
            r[i[0]]++;    // Increment the row count at i[0] index
            c[i[1]]++;    // Increment the column count at i[1] index
        }
        int cnt = 0;    // Variable for tracking count
        for(int i = 0; i < m; i++){    // For each index in rows:
            for(int j = 0; j < n; j++){    // For each index in columns:
                if((r[i] + c[j]) % 2 != 0){    // If the of both row and column increments is odd:
                    cnt++;    // Increment the counter variable
                }
            }
        }
        return cnt;    // Return the final count
    }
}
*/