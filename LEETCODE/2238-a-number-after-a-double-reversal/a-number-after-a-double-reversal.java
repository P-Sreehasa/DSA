class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num == 0){
            return true;
        }
        int rev = num % 10;
        if(rev == 0){
            return false;
        }
        return true;
    }
}


/*
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num == 0){    // If the number is equal to zero:
            return true;    // Return true (since, reversing it is still equal to 0)
        }
        int rev = num % 10;    // Variable to store the last digit of the number
        if(rev == 0){    // If the number has 0's at the end:
            return false;    // Return false (since, reversing it once won't get the original number)
        }
        return true;    // If the number does not have 0's at the end, return true (since, reversing such number gives the original number)
    }
}
*/