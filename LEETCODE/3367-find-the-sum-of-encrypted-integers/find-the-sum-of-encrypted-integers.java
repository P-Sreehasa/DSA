class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int n : nums){
            String s = String.valueOf(n);
            char m = '0';
            for(char c : s.toCharArray()){
                if(c > m){
                    m = c;
                }
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                sb.append(m);
            }
            int sbn = Integer.parseInt(sb.toString());
            sum += sbn;
        }
        return sum;
    }
}


/*
class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;    // Variable to track sum of encrypted elements
        for(int n : nums){    // For each value in the array:
            String s = String.valueOf(n);    // Calculate the value of digits by converting th enumber to string
            char m = '0';    // Variable to store maximum value, initialized with 0
            for(char c : s.toCharArray()){    // For each digit in the string:
                if(c > m){    // If the current character is greater than the maximum value:
                    m = c;    // Update the maximum value with the current value
                }
            }
            StringBuilder sb = new StringBuilder();    // Create a new StringBuilder for the encrypted string
            for(int i = 0; i < s.length(); i++){    // For each character in the string:
                sb.append(m);    // Append the maximum digit
            }
            int sbn = Integer.parseInt(sb.toString());    // Convert the string back to integer
            sum += sbn;    // Add that value to the sum variable
        }
        return sum;    // Return the final sum of the encrypted numbers
    }
}
*/