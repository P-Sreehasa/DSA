class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int arr[] = new int[n + 1];
        arr[0] = first;
        for(int i = 0; i < n; i++){
            arr[i + 1] = arr[i] ^ encoded[i];
        }
        return arr;
    }
}


/*
class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;    // Variable to store the length of the array
        int arr[] = new int[n + 1];    // Create a new array with size 1 more than the encoded array
        arr[0] = first;    // Store the first element at the starting index
        for(int i = 0; i < n; i++){    // For each index of the encoded array:
            arr[i + 1] = arr[i] ^ encoded[i];    // Store the XORed result in the next index
        }
        return arr;    // Return the final array
    }
}
*/