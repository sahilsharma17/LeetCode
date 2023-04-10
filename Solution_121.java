/* Leetcode 121. Best Time to Buy and Sell Stock
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and
 * choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */

public class Solution_121 {
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        int max = 0;
        for (int i=0; i<prices.length; i++){
            for (int j=i+1; j<prices.length; j++){
                while (prices[i]>prices[j]){
                int profit = prices[i]-prices[j];
                if (max > profit){
                    max = profit;
                }
            }
        }System.out.println(max);
    }
}
}
