package LeetCode.Medium;



import java.util.ArrayList;
import java.util.List;

class Solution {

    public int[][] merge(int[][] intervals) {

        if(intervals.length==1) return intervals;

        List<int[]> answer = new ArrayList<>();
        int cnt =0;
        int[]sub = new int[2];

        for(int i=0; i<intervals.length; i++){

            //intervals의 첫
            int[] current = intervals[i];

            for(int j=i+1; j<intervals.length; j++){
                //뒤부터 비교(겹치는지 확인)

                int[]next = intervals[j];

                if(current[1]>=next[0]){
                    //current[0]은 고정
                    //여기서 어떻게 계속 변화되게 할 수 있나? 변수선언?
                    sub = new int[]{current[0], next[1]};
                    //ㅂㅏ로넣음 안돼 뒤에 또 겹칠 수도잇어
                    cnt++;
                    continue;

                }else{
                    if(j!=i+1){
                        answer.add(sub);
                        sub = new int[2];
                        break;
                    }else {
                        answer.add(current);
                        answer.add(next);
                    }
                }
            }
        }

        int len = answer.size();
        int[][] endAnswer = new int[len][2];

        for(int k=0; k<len; k++){
            endAnswer[k]= answer.get(k);
        }
        return endAnswer;
    }
}