class Solution {
    public int theMaximumAchievableX(int num, int t) {
        return num + 2 * t;    // To return the maximum possible value of x that can be obtained by performing 2 changes at once (increment or decrement both x as well as num), multiply the no.of moves (t) by 2 and add it to num (to make the distance shrink by 2 values per move and make the value of x = num)
    }
}