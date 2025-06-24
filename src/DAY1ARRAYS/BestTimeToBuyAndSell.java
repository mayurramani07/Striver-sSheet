package DAY1ARRAYS;
import java.util.*;
public class BestTimeToBuyAndSell {
    public static int maximumProfit(int[] prices) {
        int mini = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            int cost = prices[i] - mini;
            maxProfit = Math.max(maxProfit, cost);
            mini = Math.min(mini, prices[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + maximumProfit(prices));
    }
}
