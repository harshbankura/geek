// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        int profit=0;
        int ans=0;
        int buy=Integer.MAX_VALUE;
        for(int price:prices){
            if(price>buy){
                profit=price-buy;
                ans=Math.max(profit,ans);
            }else{
                buy=price;
            }
        }
        return ans;
        // Code here
        
    }
}