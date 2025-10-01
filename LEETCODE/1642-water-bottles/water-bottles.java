class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int d = numBottles;
        int e = numBottles;
        while(e >= numExchange){
            int f = e / numExchange;
            d += f;
            e = (e % numExchange) + f;
        }
        return d;
    }
}


/*
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int d = numBottles;    // Variable to track the no.of bottles drunk
        int e = numBottles;    // Variable to track the no.of empty bottles 
        while(e >= numExchange){    // As long as the empty bottles are greater than or equal to the no.of bottles to be exchanged:
            int f = e / numExchange;    // Calculate the no.of full bottles that can be exchanged with the empty bottles
            d += f;    // Add the new full bottles to the no.of bottles drunk
            e = (e % numExchange) + f;    // Update the total no.of empty bottles by adding the new empty ones from the new filled bottles with the remaining ones
        }
        return d;    // Return the total no.of bottles drunk
    }
}
*/