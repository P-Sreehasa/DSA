class Solution {
    public int fib(int n) {
        if(n == 0 || n == 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}


/*
class Solution {
    public int fib(int n) {    
        if(n == 0 || n == 1) return n;    // If the number is 0 or 1, the fibonacci values would be 0 and 1 itself
        return fib(n - 1) + fib(n - 2);    // For numbers greater than 1, the fibonacci value would be the sum of number's previous 2 values
    }
}
*/