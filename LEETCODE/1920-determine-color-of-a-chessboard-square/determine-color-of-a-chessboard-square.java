class Solution {
    public boolean squareIsWhite(String coordinates) {
        char c = coordinates.charAt(0);
        char r = coordinates.charAt(1);
        int ri = r - '0';
        int ci = c - 'a' + 1;
        return (ri + ci) % 2 != 0;
    }
}

