class Solution {
    public int numberOfMatches(int n) {
        int c = 0;
        while(n > 1) {
            if(n % 2 == 0) {
                c += n / 2;
                n = n / 2;
            }else{
                c += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }
        return c;
    }
}



/*
class Solution {
    public int numberOfMatches(int n) {
        int c = 0;    // To keep count of the total no.of matches
        while(n > 1) {
            if(n % 2 == 0) {    // If no.of teams are even:
                c += n / 2;    // As per given: each team gets paired with another team, so total of n / 2 teams
                n = n / 2;    // n / 2 teams advance to the next round.
            }else{    // If no.of teams are odd:
                c += (n - 1) / 2;    //  One team randomly advances in the tournament, so total of (n - 1) / 2 matches
                n = (n - 1) / 2 + 1;    // The teams that moved forward are: (n - 1) / 2 + 1
            }
        }
        return c;
    }
}
*/