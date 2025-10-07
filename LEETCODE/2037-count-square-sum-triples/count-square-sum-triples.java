class Solution {
    public int countTriples(int n) {
        int a, b, c;
        int cnt = 0;
        for(a = 1; a <= n; a++){
            for(b = 1; b <= n; b++){
                int s = (a * a) + (b * b);
                c = (int) Math.sqrt(s);
                if((c * c) == s && c <= n){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}


/*
class Solution {
    public int countTriples(int n) {
        int a, b, c;    // Variables to track the square triples
        int cnt = 0;    // Counter variable to track the no.of square triples
        for(a = 1; a <= n; a++){    // For each value in the range of 1 and n:
            for(b = 1; b <= n; b++){
                int s = (a * a) + (b * b);    // Calculate a-square and b-square and store in s
                c = (int) Math.sqrt(s);    // Calclate the square-root of s and store it in c:
                if((c * c) == s && c <= n){    // If c-square is a perfect-square:
                    cnt++;    // Increment the counter variable
                }
            }
        }
        return cnt;    // Return the final count
    }
}
*/