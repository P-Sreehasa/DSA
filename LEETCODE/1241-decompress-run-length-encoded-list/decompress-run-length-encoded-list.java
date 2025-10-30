class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> r = new ArrayList<>();
        for(int i = 0; i < nums.length; i += 2){
            int f = nums[i];
            int v = nums[i + 1];
            for(int j = 0; j < f; j++){
                r.add(v);
            }
        }
        int n = r.size();
        int l[] = new int[n];
        for(int i = 0; i < n; i++){
            l[i] = r.get(i);
        }
        return l;
    }
}


/*
class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> r = new ArrayList<>();    // Create a new list to store the decompressed list
        for(int i = 0; i < nums.length; i += 2){    // For each frequency-value pair in the array:
            int f = nums[i];    // Store the frequency in f
            int v = nums[i + 1];    // Store the value in v
            for(int j = 0; j < f; j++){    // For each value from j to f:
                r.add(v);    // Add it to the list
            }
        }
        int n = r.size();    // Calculate the size of the list
        int l[] = new int[n];    // Create an array of the size of the list
        for(int i = 0; i < n; i++){    // For each value from i to n:
            l[i] = r.get(i);    // Store the current value into the array
        }
        return l;    // Return the final array
    }
}
*/