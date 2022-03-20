package LeetCode.Medium;

import java.util.Arrays;
import java.util.Collections;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        // max값을 어떻게 구할까?
        /*
            sol1

            1. 내림차순으로 정렬하고
            2. amount/최댓값 = 몫
            3. 나머지 > 두 번째값
            -> 동일하게 나누기
            4. 나누어 떨어지면 몫 다 더한 값
            5. 나누어 떨어지지 않으면 return -1
         */

      int[]dp = new int[amount+1];
      Arrays.fill(dp, amount+1);
      dp[0]=0;
      int total = 0;

      if(amount ==0){
          return 0;
      }
      for(int i=0; i<=amount; i++){
          for(int money : coins){
              if(money<=i){
                  dp[i]= Math.min(dp[i], dp[i-money]+1);
              }
          }
      }

      if(dp[amount]==amount+1){
          return -1;
      }

      return dp[amount];
    }
}
