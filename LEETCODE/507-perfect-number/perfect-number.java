class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num <= 1){
            return false;
        }
        int s = 1;
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                s += i;
                if(i != num / i){
                    s += num / i;
                }
            }
        }
        return s == num;
    }
}


/*
class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num <= 1){    // If number is less than 1:
            return false;    // Return false, (Because perfect squares start from 1)
        }
        int s = 1;    // Variable to calculate the sum
        for(int i = 2; i * i <= num; i++){    // For each value from 2 to square-root of the number:
            if(num % i == 0){    // If it is perfectly divisible by the number:
                s += i;    // Add it to the sum
                if(i != num / i){    // If the current value is not the square-root:
                    s += num / i;    // Add the other factor to the sum
                }
            }
        }
        return s == num;    // Return the final value
    }
}
*/