package Arrays;

// Problem: Buy and Sell Stock to Maximize Profit (One Transaction)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class BuyAndSellStock {

    // Function to calculate the maximum profit from a single buy and sell
    public static int buyAndSellStock(int[] prices) {
        int maxProfit = 0;

        // Initialize buyingPrice to the largest possible value
        int buyingPrice = Integer.MAX_VALUE;

        // Loop through the array to find the best day to buy and sell
        for (int i = 0; i < prices.length; i++) {

            // If current price is greater than buyingPrice, calculate profit
            if (buyingPrice < prices[i]) {
                int profit = prices[i] - buyingPrice; // today's profit
                maxProfit = Math.max(profit,  maxProfit); // update maxProfit if today's is higher
            } else {
                // If current price is less, it's a better day to buy
                buyingPrice = prices[i];
            }
        }

        return maxProfit; // Return the best possible profit
    }

    public static void main(String[] args) {
        // Sample input: Stock prices by day
        int prices[] = {7, 1, 5, 3, 6, 4};

        // Expected output: 5 (buy at 1, sell at 6)
        System.out.println("The maximum profit is " + buyAndSellStock(prices));
    }
}
