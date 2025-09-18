class Solution {
    public int minMaxDifference(int num) {
        String n = String.valueOf(num);
        char r1 = ' ';
        for(char c : n.toCharArray()){
            if(c != '9'){
                r1 = c;
                break;
            }
        }
        String maxx = n;
        if(r1 != ' '){
            maxx = n.replace(r1, '9');
        }
        char r2 = n.charAt(0);
        String minn = n.replace(r2, '0');
        return Integer.parseInt(maxx) - Integer.parseInt(minn);
    }
}


/*
class Solution {
    public int minMaxDifference(int num) {
        String n = String.valueOf(num);    // Convert number to string for character manipulation
        char r1 = ' ';    // Digit to replace for maximum
        for(char c : n.toCharArray()){    // For each character:
            if(c != '9'){    // If it is not 9:
                r1 = c;    // That would be the one to be replaced 
                break;    // Only 1st character (if not 9) is required
            }
        }
        String maxx = n;    // Variable to store the original number
        if(r1 != ' '){    // If a digit to replace is found: 
            maxx = n.replace(r1, '9');    // Replace it with 9
        }
        char r2 = n.charAt(0);    // To know the first digit
        String minn = n.replace(r2, '0');    // For minimum value, replace with 0
        return Integer.parseInt(maxx) - Integer.parseInt(minn);    // Return the final value after subtractting min value from max
    }
}
*/