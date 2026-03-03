class Solution {
    public int maxProfit(int[] prices) {
        int minn = Integer.MAX_VALUE;
        int maxx = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minn){
                minn = prices[i];
            } else{
                maxx = Math.max(maxx, prices[i] - minn);
            }
        }
        return maxx;
    }
}