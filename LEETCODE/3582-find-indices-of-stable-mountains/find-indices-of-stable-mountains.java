class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> r = new ArrayList<>();
        for(int i = 1; i < height.length; i++){
            if(height[i - 1] > threshold){
                r.add(i);
            }
        }
        return r;
    }
}


/*
class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> r = new ArrayList<>();    // List to store the result
        for(int i = 1; i < height.length; i++){    // For each value in the array:
            if(height[i - 1] > threshold){    // If the height of the previous mountain is greater than threshold:
                r.add(i);    // Add it to the list
            }
        }
        return r;    // Return the final list
    }
}
*/