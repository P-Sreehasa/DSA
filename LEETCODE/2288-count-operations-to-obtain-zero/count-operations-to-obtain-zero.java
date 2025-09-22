class Solution {
    public int countOperations(int num1, int num2) {
        int c = 0;
        while(num1 > 0 && num2 > 0){    
            if(num1 >= num2){
                c += num1 / num2;
                num1 %= num2;
            } else{
                c += num2 / num1;
                num2 %= num1;
            }
        }
        return c;
    }
}


/*
class Solution {
    public int countOperations(int num1, int num2) {
        int c = 0;    // Variable to track count of the total no.of operations
        while(num1 > 0 && num2 > 0){    // As long as both the numbers are greater than 0:
            if(num1 >= num2){    // If the 1st number is greater than or equal to the 2nd one:
                c += num1 / num2;    // Divide the 1st number by 2nd and append it to the counter variable
                num1 %= num2;    // Store the remainder obtained after dividing the 1st number with the 2nd, and store it in the 1st number
            } else{    // If the 2nd number is greater than or equal to the 1st one:
                c += num2 / num1;    // Divide the 2nd number by 1st and append it to the counter variable
                num2 %= num1;    // Store the remainder obtained after dividing the 2nd number with the 1st, and store it in the 2nd number
            }
        }
        return c;    // Return the final count
    }
}
*/