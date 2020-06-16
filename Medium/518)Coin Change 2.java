//Problem:
//https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/539/week-1-june-1st-june-7th/3353/

class Solution {
    public int change(int amount, int[] coins) {

        int dp[] = new int[amount + 1]; //we make a storage for denominations from 0 to amount.
        dp[0] = 1; //zero amount pay krne ka tarika is always one i.e no coin is used.

        for (int coin: coins) {
            for (int amt = 1; amt <= amount; amt++) {
                if (amt - coin >= 0) {
                    //accepted value
                    dp[amt] = dp[amt] + dp[amt - coin];
                }
            }
        }

        return dp[amount];

    }
}