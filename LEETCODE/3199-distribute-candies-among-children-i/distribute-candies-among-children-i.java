class Solution {
    public int distributeCandies(int n, int limit) {
        int cnt = 0;
        for(int a = 0; a <= limit; a++){
            for(int b = 0; b <= limit; b++){
                int c = n - a - b;
                if(c >= 0 && c <= limit){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}


/*
class Solution {
    public int distributeCandies(int n, int limit) {
        int cnt = 0;    // Variable for maintaining count of the no.of distributions
        for(int a = 0; a <= limit; a++){    // For each value in the range of the first person:
            for(int b = 0; b <= limit; b++){    // For each value in the range of the second person:
                int c = n - a - b;    // Calculate the no.of candies for the third person by subtracting the total from 1st person's and 2nd person's candies
                if(c >= 0 && c <= limit){    // If the value of c is in the range of 0 and limit:
                    cnt++;    // Increment the counter variable
                }
            }
        }
        return cnt;    // Return the final count
    }
}
*/