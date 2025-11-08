class Solution {
    public boolean isHappy(int n) {
        List<Integer> l = new ArrayList<>();
        while(n != 1 && !l.contains(n)){
            l.add(n);
            int s = 0;
            while(n > 0){
                int rem = n % 10;
                s = s + rem * rem;
                n /= 10;
            }
            n = s;
        }
        return n == 1;
    }
}


/*
class Solution {
    public boolean isHappy(int n) {
        List<Integer> l = new ArrayList<>();    // List to store the result
        while(n != 1 && !l.contains(n)){    // While the number is not equal to 1 and the list doesn't contain the value:
            l.add(n);    // Add it to the list
            int s = 0;    // Variable to store the sum
            while(n > 0){    // As long as the number is greater than 0:
                int rem = n % 10;    // Extract the last digit of the number
                s = s + rem * rem;    // Multiply the last digit with itself and add it to the sum
                n /= 10;    // Remove the last digit
            }
            n = s;    // Store the sum in the number
        }
        return n == 1;    // Return the final value (true if n is equal to 1, false otherwise)
    }
}
*/