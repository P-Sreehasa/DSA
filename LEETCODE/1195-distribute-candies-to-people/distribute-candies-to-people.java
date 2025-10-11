class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int r[] = new int[num_people];
        int c = 1;
        int i = 0;
        while(candies > 0){
            int can = Math.min(c, candies);
            r[i] += can;
            candies -= can;
            i = (i + 1) % num_people;
            c++;
        }
        return r;
    }
}


/*
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int r[] = new int[num_people];    // Result array to store the no.of candies per persom
        int c = 1;    // Let the candies be 1 for the first distribution
        int i = 0;    // Variable for tracking the 1st person
        while(candies > 0){    // As long as there are candies:
            int can = Math.min(c, candies);    // Calculate the no.of candies to give
            r[i] += can;    // Add those no.of candies to the result array
            candies -= can;    // Remove the given-out no.of candies 
            i = (i + 1) % num_people;    // Move to the next person
            c++;    // Increment the candies count for the next person
        }
        return r;    // Return the array 
    }
}
*/