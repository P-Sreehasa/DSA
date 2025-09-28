class Solution {
    public int fib(int n) {
        while(n > 1){
            return fib(n - 1) + fib (n - 2);
        }
        return n;
    }
}


/*
class Solution {
    public int fib(int n) {
        while(n >= 2){    // As long as the value of n is greater than 1:
            return fib(n - 1) + fib (n - 2);    // Recursively compute fib(n-1) + fib(n-2)
        }
        return n;    // If n value is less than 2, return the base value (If n=0, return 0, if n=1, return 1)
    }
}
*/