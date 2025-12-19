class Solution {
    public int countTriples(int n) {
        int count = 0;
        for(int a = 1; a <= n; a++){
            for(int b = 1; b <= n; b++){
                int c_square = (a * a) + (b * b);
                int c = (int)Math.sqrt(c_square);
                if(c * c == c_square && c <= n){
                    count++;
                }  
            }
        }
        return count;
    }
}


/*
class Solution {
    public int countTriples(int n) {
        int count = 0;    // Variable to track the no.of square triplets
        for(int a = 1; a <= n; a++){    // For each value of a from 1 to n:
            for(int b = 1; b <= n; b++){    // For each value of b from 1 to n:
                int c_square = (a * a) + (b * b);    // Calculate a2 + b2
                int c = (int)Math.sqrt(c_square);    // Calculate square-root of a2 + b2 and store it in c
                if(c * c == c_square && c <= n){    // Check whether a2 + b2 = c2 and c ≤ n:
                    count++;    // (If yes) Increment the counter variable
                }  
            }
        }
        return count;    // Return the final count of the total no.of square triplets
    }
}
*/