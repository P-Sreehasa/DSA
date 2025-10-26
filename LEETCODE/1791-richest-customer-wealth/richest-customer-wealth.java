class Solution {
    public int maximumWealth(int[][] accounts) {
        int w = 0;
        for(int i = 0; i < accounts.length; i++){
            int m = 0;
            for(int j = 0; j < accounts[i].length; j++){
                m += accounts[i][j];
            }
            if(m > w){
                w = m;
            }
        }
        return w;
    }
}


/*
class Solution {
    public int maximumWealth(int[][] accounts) {
        int w = 0;    // Variable to store the maximum wealth
        for(int i = 0; i < accounts.length; i++){    // For each value in the array:
            int m = 0;    // Variable to store the current maximum
            for(int j = 0; j < accounts[i].length; j++){    // For each value in the array:
                m += accounts[i][j];    // Add it to the maximum variable
            }
            if(m > w){    // If the current maximum is greater than the maximum wealth:
                w = m;    // Store the maximum in m
            }
        }
        return w;    // Return the final maximum
    }
}
*/