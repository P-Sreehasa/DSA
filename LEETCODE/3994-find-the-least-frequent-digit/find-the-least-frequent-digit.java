class Solution {
    public int getLeastFrequentDigit(int n) {
        int a[] = new int[10];
        while(n > 0){
            int l = n % 10;
            a[l]++;
            n /= 10;
        }
        int minn = Integer.MAX_VALUE;
        int r = -1;
        for(int i = 0; i < 10; i++){
            if(a[i] > 0 && a[i] < minn){ 
                minn = a[i];
                r = i;
            } else if(a[i] == minn && i < r){
                r = i;
            }
        }
        return r;
    }
}


/*
class Solution {
    public int getLeastFrequentDigit(int n) {
        int a[] = new int[10];    // Array to store digits frequency
        while(n > 0){    // As long as the number is greater than 0:
            int l = n % 10;    // Get the last digit
            a[l]++;    // Add it to the array and increment it
            n /= 10;    // Remove the last digit
        }
        int minn = Integer.MAX_VALUE;    // Variable to track the minimum value
        int r = -1;    // Result variable to store the least value
        for(int i = 0; i < 10; i++){    // For each value in the range of 0 - 9:
            if(a[i] > 0 && a[i] < minn){    // If the value is greater than 0 and less than the minimum value:
                minn = a[i];    // Update the current value as the minimum value
                r = i;    Update the current value in the result variable
            } else if(a[i] == minn && i < r){    // If the value is equal to minimum value and less than the result:
                r = i;    // Update the current value in the result variable
            }
        }
        return r;    // Return the final result
    }
}
*/