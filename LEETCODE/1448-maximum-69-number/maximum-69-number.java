class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '6'){
                s = s.substring(0, i) + '9' + s.substring(i + 1);
                break;
            }
        }
        return Integer.parseInt(s);
    }
}


/*
class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);    // Store the string equivalent value of number in a variable
        for(int i = 0; i < s.length(); i++){    // For each value in the length of the string:
            if(s.charAt(i) == '6'){    // If the current value is 6:
                s = s.substring(0, i) + '9' + s.substring(i + 1);    // Change it to 9
                break;    // Terminate the loop
            }
        }
        return Integer.parseInt(s);    // Return the integer value
    }
}
*/