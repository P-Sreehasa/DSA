class Solution {
    public int[] constructRectangle(int area) {
        int s = (int)Math.sqrt(area);
        for(int i = s; i > 0; i--){
            if(area % i == 0){
                int j = area / i;
                int r[] = new int[2];
                r[0] = Math.max(i, j);
                r[1] = Math.min(i, j);
                return r;
            }
        }
        int r[] = new int[2];
        r[0] = area;
        r[1] = 1;
        return r;
    }
}


/*
class Solution {
    public int[] constructRectangle(int area) {
        int s = (int)Math.sqrt(area);    // Calculate the sqrt.of the area and store it in s
        for(int i = s; i > 0; i--){    // For each value:
            if(area % i == 0){    // If the current value is divisible by area:
                int j = area / i;    // Divide the area by the current value and store it in j
                int r[] = new int[2];    // Initialize an array of 2 elements:
                r[0] = Math.max(i, j);    // Store the maximum of i and j at the 1st index
                r[1] = Math.min(i, j);    // Store the minimum of i and j at the 2n index
                return r;    // Return the array
            }
        }
        int r[] = new int[2];    // If there are no divisors (other than 1):
        r[0] = area;    // Store the area at the 1st index
        r[1] = 1;    // Store 1 at the 2nd index
        return r;    // Return the array
    }
}
*/