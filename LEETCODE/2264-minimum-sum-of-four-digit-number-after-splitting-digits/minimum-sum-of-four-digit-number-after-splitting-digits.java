class Solution {
    public int minimumSum(int num) {
        int arr[] = new int[4];
        int last = 0;
        while(num > 0){
            arr[last++] = num % 10;
            num /= 10;
        }
        java.util.Arrays.sort(arr);
        int number1 = arr[0] * 10 + arr[2];
        int number2 = arr[1] * 10 + arr[3];
        return number1 + number2;
    }
}


/*
class Solution {
    public int minimumSum(int num) {
        int arr[] = new int[4];    // Array to store the digits of the number
        int last = 0;    // Variable to track the array indices
        while(num > 0){    // As long as the number is greater than 0:
            arr[last++] = num % 10;   // Extract the last digit of the number, add it to the array
            num /= 10;    // Move to the next digit
        }
        java.util.Arrays.sort(arr);    // Sort the array
        int number1 = arr[0] * 10 + arr[2];    // Store the 1st and 3rd index values as the frst number
        int number2 = arr[1] * 10 + arr[3];    // Store the 2nd and 4th index values as the second number
        return number1 + number2;    // Return the sum of both the numbers as the result
    }
}
*/