class Solution {
    public int commonFactors(int a, int b) {
        while(b != 0){
            int t = b;
            b = a % b;
            a = t;
        }
        int gcd = a;
        int c = 0;
        for(int i = 1; i <= gcd; i++){
            if(gcd % i == 0){
                c++;
            }
        }
        return c;
    }
}


/*
class Solution {
    public int commonFactors(int a, int b) {
        while(b != 0){    // As long as the value of b is not equal to 0:
            int t = b;    // Temporary variable to store the value of b
            b = a % b;    // Store the remainder (when a is divided by b) in b
            a = t;    // Store b's actual value in a
        }
        int gcd = a;    // Variable to store the gcd value of a and b
        int c = 0;    // Variable to mainatin count of common factors
        for(int i = 1; i <= gcd; i++){    // As long as teh number is in the range of 1 and gcd:
            if(gcd % i == 0){    // If the number divides gcd exactly:
                c++;    // Increment the counter variable
            }
        }
        return c;    // Return the count (total no.of common factors)
    }
}
*/