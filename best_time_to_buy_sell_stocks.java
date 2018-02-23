class Solution {
    public int maxProfit(int[] prices) {
        // I will approach this problem by taking the difference between maximum and minimum element.
       
        
        // Boundary condition to be handled appropriately.
        if( prices.length == 0 )
            return 0;
         
        int min = prices[0], max = 0, maxProf = 0;
        
        // Iterate through the nums array to find the maxProfit.
        for( int i=1;i<prices.length;  i++)
        {
            if(min > prices[i])
                min = prices[i];
            else
            {
                if(prices[i] - min > maxProf)
                {
                    maxProf = prices[i] - min;
                    max = prices[i];
                }
            }
        }
        
        return maxProf;
        
    }
}
