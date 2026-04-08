class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        
        int p = 0;
        for(int r = 1; r < prices.length; r++){
            if(prices[p] < prices[r]){
                int temp = prices[r] - prices[p];
                result = Math.max(temp , result);
            }else{
                p = r;
            }
        }
        
        return result;
    }
}
