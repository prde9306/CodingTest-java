package LeetCode.Medium;
//거의 다 푼 것 같은데

class Solution {

    // 처음끼기 직전까지는 intervals 그대로 놔두기
    // newInterval시작점을  interval어디 사이에 처음으로 끼나비교 && 끝점을 어디마지막까지 끼나 비교?
    // 끝점이 다음 intervals 사이라면 시작점부터 그점까지 합치기


    public int[][] insert(int[][] intervals, int[] newInterval) {
        int start = newInterval[0];
        int end = newInterval[1];
        int first =0;
        int last =0;

        for(int i=0; i<intervals.length; i++){
            if(intervals[i][0]<= start && start<=intervals[i][1]){
                first =i;
            }

            if(intervals[i][0]<=end && end<=intervals[i][1]){
                last =i;
            }
        }
        int len =0;
        if(first==0 && last==intervals.length-1){
            len = intervals.length;
        }else if(first==0 && last !=intervals.length){
            len = 2+ intervals.length-last;
        }else if(first!=0 && last==intervals.length-1){
            len = first+2;
        }else{
            len = 1+first+1 + intervals.length-last;
        }

        int[][] answer = new int[len][2];


        //i-1까지는 그대로 넣어주기
        for(int i=0; i<=first-1; i++){
            for(int j=0; j<2; j++){
                answer[i][j]= intervals[i][j];
            }
        }
        //
        answer[first][0]= intervals[first][0];
        answer[first][1]= Math.max(intervals[last][1], newInterval[1]);

        //그 뒤에
        for(int i=last+1; i<intervals.length; i++){
            for(int j=0; j<2; j++){
                answer[i][j]= intervals[i][j];
            }
        }

        return answer;
    }

}