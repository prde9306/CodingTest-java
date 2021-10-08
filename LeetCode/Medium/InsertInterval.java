package LeetCode.Medium;
//거의 다 푼 것 같은데

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        if(intervals.length == 0) return new int[][] { newInterval }; //Edge case

        List<int[]> list = new ArrayList<>();

        boolean isAvailable = true;

        for(int i=0; i<intervals.length; i++) {

            //newinterval 겹치는 뒷 부분 넣는 것
            int[] nowInterval = intervals[i];

            if(!isAvailable) {
                list.add(nowInterval);
                continue;
            }

            if(nowInterval[0] > newInterval[1]) {
                list.add(nowInterval);
                continue;
            }
            //앞부분 겹치기 전 앞 부문 넣는 것

            if(nowInterval[1] < newInterval[0]) list.add(nowInterval);

                //겹친다면~
            else { //nowInterval[1] >= newInterval[0]

                isAvailable = false;
                int tempLeft = Math.min(nowInterval[0], newInterval[0]);
                int tempRight = Math.max(nowInterval[1], newInterval[1]);

                //ㅇㅓ디까지 겹치는지 확인
                for(int j=i+1; j<intervals.length; j++) {

                    i++;

                    int[] nextInterval = intervals[j];

                    if(nextInterval[0] > tempRight) {
                        i--;
                        break;
                    }
                    else tempRight = Math.max(tempRight, nextInterval[1]);
                }

                list.add(new int[] { tempLeft, tempRight });
            }
        }

        if(isAvailable) {
            list.add(newInterval);
        }

        int[][] result = list.toArray(new int[][]{new int[list.size()]});

        Arrays.sort(result, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        return result;
    }
}