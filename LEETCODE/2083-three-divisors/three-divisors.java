class Solution {
    public boolean isThree(int n) {
        for(int i = 2; i * i <= n; i++){
            if(i * i == n){
                boolean y = true;
                for(int j = 2; j * j <= i; j++){
                    if(i % j == 0){
                        y = false;
                        break;
                    }
                }
                return y;
            }
        }
        return false;
    }
}


/*
class Solution {
    public boolean isThree(int n) {
        for(int i = 2; i * i <= n; i++){    // For every value in the range of 2 to sqrt.of n:
            if(i * i == n){    // If i is the sqrt.of n:
                boolean y = true;    // Variable to track if the number is prime
                for(int j = 2; j * j <= i; j++){    // For every value in the range of 2 to sqrt.of n:
                    if(i % j == 0){    // If i is not prime:
                        y = false;    // Return false
                        break;    // Terminate the loop
                    }
                }
                return y;    // Return if the value is prime or not
            }
        }
        return false;    // If n is not a perfect square, return false
    }
}
*/