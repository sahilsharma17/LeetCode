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
