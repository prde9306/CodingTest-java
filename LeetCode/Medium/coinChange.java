package LeetCode.Medium;

import java.util.Arrays;

class Solution {
    //다시 풀어야 한다. 확실히 못품

    public int coinChange(int[] coins, int amount) {
        int[] dy = new int[amount + 1];
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;

        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                dy[j] = Math.min(dy[j], dy[j - coins[i]] + 1);
            }
        }
        return dy[amount];
    }
}
