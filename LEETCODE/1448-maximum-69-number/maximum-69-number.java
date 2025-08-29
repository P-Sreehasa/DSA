class Solution {
    public int maximum69Number (int num) {
        char c[] = Integer.toString(num).toCharArray();    
        for(int i = 0; i < c.length; i++){
            if(c[i] == '6'){
                c[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(c));
    }
}


/*
class Solution {
    public int maximum69Number (int num) { 
        char c[] = Integer.toString(num).toCharArray();    // Convert the number from integer to string and then to character array
        for(int i = 0; i < c.length; i++){    // For every character in the array:
            if(c[i] == '6'){    // If the character's value is 6:
                c[i] = '9';    // Then change it to 9 (Since we need the maximum value)
                break;    // Since only 1 digit can be changed
            }
        }
        return Integer.parseInt(new String(c));    // Return the final value by converting the character array back to string and then to integer
    }
}
*/