package LeetCode.hard;

import java.util.Arrays;

public class MaximumProfitinJobScheduling {

    //sol1 틀림
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
       int answer =0;
        int[] profits =new int[startTime.length];
        //length까지 갈 필요 있을까??
        //  시작점 0에서 동적으로 바꿔줘야 할 거 같은데?
       for(int j=0; j<startTime.length; j++) {
           for (int i = 0; i < startTime.length-1; i++) {
               if (endTime[i] <= startTime[i + 1]) {
                   profits[j] += profit[i];
               }
           }
       }
       Arrays.sort(profits);
       answer = profits[startTime.length-1];
       return answer;
    }

    //sol2


}
