class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c = 0;
        for(int i = left; i <= right; i++){
            int sb = Integer.bitCount(i);
            if(sb < 2){
                continue;
            }
            boolean p = true;
            for(int j = 2; j * j <= sb; j++){
                if(sb % j == 0){
                    p = false;
                    break;
                }
            }
            if(p){
                c++;
            }
        }
        return c;
    }
}


/*
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c = 0;    // Variable to track the count of prime no.of set-bits
        for(int i = left; i <= right; i++){    // For each value in the range of left and right:
            int sb = Integer.bitCount(i);    // Count the set-bits of i
            if(sb < 2){    // If the set-bits values is less than 2:
                continue;    // Skip them
            }
            boolean p = true;    // Flag bit to track if the set-bits are prime
            for(int j = 2; j * j <= sb; j++){    // For each value:
                if(sb % j == 0){    // If the set-bit is divisible by j:
                    p = false;    // Set the flag bit to false
                    break;    // Terminate the condition
                }
            }
            if(p){    // If the value is prime:
                c++;    // Increment the counter variable
            }
        }
        return c;    // Return the final count
    }
}
*/