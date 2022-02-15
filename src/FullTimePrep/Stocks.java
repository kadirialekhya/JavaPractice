package FullTimePrep;

public class Stocks {
    public int maxProfit(int [] prices)
    {
        int max=0;
        int min=Integer.MIN_VALUE;
        for (int i=0;i<prices.length;i++)
        {
            if (prices[i]<min)
            {
                min=prices[i];
            }
            else
            {
                max=Math.max(max,prices[i]-min);
            }
        }
        return max;
    }
}
