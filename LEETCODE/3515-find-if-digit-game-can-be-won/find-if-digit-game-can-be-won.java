class Solution {
    public boolean canAliceWin(int[] nums) {
        int s = 0;
        int sd = 0;
        int dd = 0;
        for(int n : nums){
            s += n;
            if(n < 10){
                sd += n;
            }else{
                dd += n;
            }
        }
        boolean sdw = sd > s / 2;
        boolean ddw = dd > s / 2;
        return sdw || ddw;
    }
}


/*
class Solution {
    public boolean canAliceWin(int[] nums) {
        int s = 0;    // Variable to store sum of numbers
        int sd = 0;    // Variable to store sum of single digit numbers
        int dd = 0;    // Variable to store sum of double digit numbers
        for(int n : nums){    // For each number in the array:
            s += n;    // Add it to the sum
            if(n < 10){    // If the number is less than 10:
                sd += n;    // Add it to the single-digit sum
            }else{    // If not:
                dd += n;    // Add it to the double-digit sum
            }
        }
        boolean sdw = sd > s / 2;    // Variable to store the boolean value if single-digit sum is greater than half of the sum
        boolean ddw = dd > s / 2;    // Variable to store the boolean value if double-digit sum is greater than half of the sum
        return sdw || ddw;    // Return the final value
    }
}
*/