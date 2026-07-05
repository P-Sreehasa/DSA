class Solution {
    public int minCostToMoveChips(int[] position) {
        int e = 0;
        int o = 0;
        for(int p : position){
            if(p % 2 == 0){
                e++;
            } else{
                o++;
            }
        }
        int minn = Math.min(e, o);
        return minn;
    }
}


/*
class Solution {
    public int minCostToMoveChips(int[] position) {
        int e = 0;    // Variable to track even-positioned chips
        int o = 0;    // Variable to track odd-positioned chips
        for(int p : position){    // For each position:
            if(p % 2 == 0){    // If it is at even position:
                e++;    // Increment the even counter
            } else{    // If it is at odd position:
                o++;    // Increment the odd counter
            }
        }
        int minn = Math.min(e, o);    // Calculate the minimum cost
        return minn;    // Return the minimum cost for moving all the chips
    }
}
*/