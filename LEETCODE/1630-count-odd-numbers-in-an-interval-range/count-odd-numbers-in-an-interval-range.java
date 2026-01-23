class Solution {
    public int countOdds(int low, int high) {
        int h = (high + 1) / 2;
        int l = low / 2;
        return h - l;
    }
}


/*
class Solution {
    public int countOdds(int low, int high) {
        int h = (high + 1) / 2;    // Count of odd numbers from 0 to high
        int l = low / 2;    // Count of odd numbers from 0 to low - 1
        return h - l;    // Subtract high from low to get the total count
    }
}
*/