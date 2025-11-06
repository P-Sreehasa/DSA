class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 2){
            return true;
        }
        long l = 2;
        long r = num / 2;
        while(l <= r){
            long m = l + (r - l) / 2;
            long s = m * m;
            if(s == num){
                return true;
            } else if(s < num){
                l = m + 1;
            } else{
                r = m - 1;
            }
        }
        return false;
    }
}



/*
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 2){    // 0 and 1 are perfect squares
            return true;    // Thus, return true
        }
        long l = 2;    // Variable to store the left value
        long r = num / 2;    // Variable to store the right values
        while(l <= r){    // As long as left is less than or equal to right:
            long m = l + (r - l) / 2;    // Calculate the middle value
            long s = m * m;    // Calculate the square value
            if(s == num){    // If the squared and number values are same:
                return true;    // The number is a perfect-square
            } else if(s < num){    // If the squared value is less than the number:
                l = m + 1;    // Move the right pointer forward
            } else{    // If the squared value is greater than the number:
                r = m - 1;    // Move the right pointer backwards
            }
        }
        return false;    // If not, the number is not a perfect square
    }
}
*/