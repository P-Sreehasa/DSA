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