class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int max = candies[0];
        for(int i = 1; i < n; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        List<Boolean> res = new ArrayList<>();
        for(int i = 0; i < n; i ++){
            if(candies[i] + extraCandies >= max){
                res.add(true);
            } else{
                res.add(false);
            }
        }
        return res;
    }
}


/*
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;    // Calculate the length of the array
        int max = candies[0];    // Store the first element in Maximum variable
        for(int i = 1; i < n; i++){     // For each value in tha array, starting from the 2nd index:
            if(candies[i] > max){    // If the current value is greater than the maximum:
                max = candies[i];    // Update the maximum variable
            }
        }
        List<Boolean> res = new ArrayList<>();    // List to store the result
        for(int i = 0; i < n; i ++){    // For each index in the array:
            if(candies[i] + extraCandies >= max){    // If the addition of candies extraCandies is greater than or equal to the maximum:
                res.add(true);    // Return true to the list
            } else{    // If the addition of candies extraCandies is not greater than or equal to the maximum:
                res.add(false);    // Add false to th elist
            }
        }
        return res;    // Return a value based on the final result
    }
}
*/