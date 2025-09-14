class Solution {
    public int totalMoney(int n) {
        int t = 0;
        int w = n / 7;
        int d = n % 7;
        for(int i = 0; i < w; i++){
            int s = i + 1;
            t += 7 * s + 21;
        }
        int s = w + 1;
        for(int i = 0; i < d; i++){
            t += s + i;
        }
        return t;
    }
}


/*
class Solution {
    public int totalMoney(int n) {
        int t = 0;    // Variable to track count of total money
        int w = n / 7;    // Variable to store no.of full weeks
        int d = n % 7;    // Variable to no.of days after full weeks
        for(int i = 0; i < w; i++){    // For every index of the full week:
            int s = i + 1;    // Monday's deposit (for week-i) is 1 + i
            t += 7 * s + 21;    // total money is "7 * s" if each days has Monday's amount and the sum of daily increments for the rest of the next days is "21" (sum from 0 to 6)
        }
        int s = w + 1;    // For the partial weeks, the Monday's deposit is w + 1
        for(int i = 0; i < d; i++){   // For non-full weeks:
            t += s + i;    // Each day's deposit is Monday's deposit + index 
        }
        return t;    // Return the money saved after n days
    }
}
*/