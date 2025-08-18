class Solution {
    public int smallestEvenMultiple(int n) {
        if(n % 2 == 0){
            return n;
        }else{
            return 2 * n;
        }
    }
}


/*
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n % 2 == 0){    // Check if the number is even
            return n;    // If yes, return the number, since it's already divisible by 2;
        }else{    
            return 2 * n;    // Since the number is odd, return the smallest number divisible by both 2 and n (LCM of the number and 2)
        }
    }
}
*/