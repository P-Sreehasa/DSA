class Solution {
    public boolean canAliceWin(int n) {
        if(n < 10){
            return false;
        }
        int temp = n;
        int t = 1;
        int s = 10;
        while(temp >= s){
            temp -= s;
            s--;
            t = 1 - t;
        }
        return t == 0;
    }
}


/*
class Solution {
    public boolean canAliceWin(int n) {
        if(n < 10){    // If there are less than 10 stones:
            return false;    // Return false
        }
        int temp = n;    // Store n (no.of stones) in a temporary variable
        int t = 1;    // To track whose turn it is
        int s = 10;    // No.of stones to be removed
        while(temp >= s){    // As long as there are greater than 's' stones:
            temp -= s;    Remove 's' stones from temp
            s--;    // Decrement the 's' counter
            t = 1 - t;    // Switch the turn
        }
        return t == 0;    // If t is 0, Alice wins. Otherwise, Bob wins
    }
}
*/