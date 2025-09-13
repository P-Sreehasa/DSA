class Solution {
    public String interpret(String command) {
        String c = command.replace("()", "o");
        c = c.replace("(al)", "al");
        return c;
    }
}



/*
class Solution {
    public String interpret(String command) {
        String c = command.replace("()", "o");    // Variable to store the string after "()" gets replaced with "o"
        c = c.replace("(al)", "al");    // Variable to store the string after "(al)" gets replaced with "al"
        return c;    // Return the final string after the replacements 
    }
}
*/

