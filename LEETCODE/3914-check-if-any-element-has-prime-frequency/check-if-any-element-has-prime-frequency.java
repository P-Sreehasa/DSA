class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int f[] = new int[101];
        for(int n : nums){
            f[n]++;
        }
        for(int fr : f){
            if(fr > 1){
                boolean p = true;
                for(int i = 2; i * i <= fr; i++){
                    if(fr % i == 0){
                        p = false;
                        break;
                    }
                }
                if(p){
                    return true;
                }
            }
        }
        return false;
    }
}


/*
class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int f[] = new int[101];    // Array to store number frequencies (101 because the value can be anywhere from 0 to 100, included)
        for(int n : nums){    // For each value in the array:
            f[n]++;    Store it into the frequency array 
        }
        for(int fr : f){    // For each value in the frequency array:
            if(fr > 1){    // If the current value is greater than 1:
                boolean p = true;    // Variable to track whether the value is prime or not
                for(int i = 2; i * i <= fr; i++){    // For each value from 2 to sqrt.of the element:
                    if(fr % i == 0){    // If it is divisible by the number:
                        p = false;    // Mark it as not prime
                        break;    // Terminate the loop
                    }
                }
                if(p){    // If the value is prime:
                    return true;    // Return true
                }
            }
        }
        return false;    // Else, return false
    }
}
*/