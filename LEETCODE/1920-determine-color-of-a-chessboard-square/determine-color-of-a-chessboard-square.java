class Solution {
    public boolean squareIsWhite(String coordinates) {
        char c = coordinates.charAt(0);
        char r = coordinates.charAt(1);
        int ri = r - '0';
        int ci = c - 'a' + 1;
        return (ri + ci) % 2 != 0;
    }
}


/*
class Solution {
    public boolean squareIsWhite(String coordinates) {
        char c = coordinates.charAt(0);    // To get the first character (column letters: a - h)
        char r = coordinates.charAt(1);    // To get the second character (row numbers: 1 - 8)
        int ri = r - '0';    // To calculate the ASCII value of the row character
        int ci = c - 'a' + 1;    // To calculate the ASCII value of the column character
        return (ri + ci) % 2 != 0;    // Return if the color is white or not (If the sum of the row and column indices is odd -> the square is white
        else -> black)
    }
}
*/