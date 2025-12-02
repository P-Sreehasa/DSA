class Solution {
    public int smallestEvenMultiple(int n) {
        if(n % 2 != 0){
            return n * 2;
        }
        return n;
    }
}


/*
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n % 2 != 0){    // If n is Odd:
                return n * 2;    // Multiply it by 2
        }
        return n;    // If n is Even, return that number itself
    }
}
*/