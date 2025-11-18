class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Integer n[] = new Integer[names.length];
        for(int i = 0; i < names.length; i++){
            n[i] = i;
        }
        Arrays.sort(n, (a, b) -> heights[b] - heights[a]);
        String arr[] = new String[names.length];
        for(int i = 0; i < names.length; i++){
            arr[i] = names[n[i]];
        }
        return arr;
    }
}


/*
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Integer n[] = new Integer[names.length];    // Array to store the indices of people
        for(int i = 0; i < names.length; i++){    // For each index of the array:
            n[i] = i;    // Store it into the array
        }
        Arrays.sort(n, (a, b) -> heights[b] - heights[a]);    // Sort the array in descending order 
        String arr[] = new String[names.length];    // Array to store the result
        for(int i = 0; i < names.length; i++){    // For each index of the array:
            arr[i] = names[n[i]];    // From the sorted array, store them into the result array
        }
        return arr;    // Return the final array
    }
}
*/