class Solution {
    public int findClosest(int x, int y, int z) {
        int d1 = Math.abs(z - x);
        int d2 = Math.abs(z - y);
        if(d1 < d2){
            return 1;
        } else if(d1 > d2){
            return 2;
        }
        return 0;
    }
}


/*
class Solution {
    public int findClosest(int x, int y, int z) {
        int d1 = Math.abs(z - x);    // To calculate the absolute value of the distance from x to z
        int d2 = Math.abs(z - y);    // To calculate the absolute value of the distance from y to z
        if(d1 < d2){    // If x is closer to z:
            return 1;    // Return that x arrives first (Return 1 if Person 1 (x) arrives first)
        } else if(d1 > d2){    // If y is closer to z:    
            return 2;    // Return that y arrives first (Return 2 if Person 2 (y) arrives first)
        }
        return 0;    // Both are equally close (Return 0 if both arrive at the same time)
    }
}
*/