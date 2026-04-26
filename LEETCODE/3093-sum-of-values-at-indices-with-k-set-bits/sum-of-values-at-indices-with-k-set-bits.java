class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int s = 0;
        for(int i = 0; i < nums.size(); i++){
            if(Integer.bitCount(i) == k){
                s += nums.get(i);
            }
        }
        return s;
    }
}


/*
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int s = 0;    // Variable to store the sum
        for(int i = 0; i < nums.size(); i++){    // For each index of the list:
            if(Integer.bitCount(i) == k){    // If the set-bits value of the current index is equal to k:
                s += nums.get(i);    // Add the element to the sum
            }
        }
        return s;    // Return the final sum 
    }
}
*/