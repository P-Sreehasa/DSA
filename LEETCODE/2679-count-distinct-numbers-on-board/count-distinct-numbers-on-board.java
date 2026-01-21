class Solution {
    public int distinctIntegers(int n) {
        if(n == 1){
            return 1;
        }
        return n - 1;
    }
}


    /*
    class Solution {
        public int distinctIntegers(int n) {
            if(n == 1){    // If n is 1, return 1
                return 1;
            }
            return n - 1;    // Otherwise, subtract 1 from the number and return it
        }
    }
*/