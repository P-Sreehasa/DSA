class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int n = Math.abs(nums[i]) - 1;
            if(nums[n] > 0){
                nums[n] = -nums[n];
            }
        }
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                l.add(i + 1);
            }
        }
        return l;
    }
}


/*
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i = 0; i < nums.length; i++){    // For each index of the array:
            int n = Math.abs(nums[i]) - 1;    // Calculate the index values of the current numbers (1's index is 0, 2's as 1 and so on)
            if(nums[n] > 0){    // If the value is greater than 0:
                nums[n] = -nums[n];    // Make it negative
            }
        }
        List<Integer> l = new ArrayList<>();    // Create a list to store the result
        for(int i = 0; i < nums.length; i++){    // For each index of the array:
            if(nums[i] > 0){    // If the current value is greater than 0:
                l.add(i + 1);    // Add it to the list
            }
        }
        return l;    // Return the final list
    }
}
*/