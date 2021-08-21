package Programmers.StackQueue;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];
        //시간 측정
        for(int i=0; i < progresses.length;i++){
            int prog = progresses[i];
            int workingTime = 0;
            while(true){
                if(prog >= 100) break;
                prog += speeds[i];
                workingTime++;  //일한 시간 입니다.
            }
            answer[i] = workingTime;
        }

        //값 확인
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0 ; i < answer.length ; i++){  //기준값 입니다.
            int origin = answer[i];
            int count = 1;
            if(origin < 0){continue;} //조사가 완료된 대상이면 건너뛰기를 합니다.
            for(int j=i+1 ; j < answer.length ; j++){  //기준값 다음의 값 입니다.
                int compare = answer[j];
                if(origin >= compare){
                    answer[j] = -1; //조사가 완료되었으므로 대상에서 제거 합니다.
                    count++;
                } else {
                    break;
                }
            }
            list.add(count);
        }
        answer = list.stream().mapToInt(i ->i).toArray();
        return answer;
    }
    //sol2
    class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            int[] dayOfend = new int[100];
            int day = -1;
            for(int i=0; i<progresses.length; i++) {
                while(progresses[i] + (day*speeds[i]) < 100) {
                    day++;
                }
                dayOfend[day]++;
            }
            return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
        }
    }

    //sol3
    import java.util.*;

    class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            Queue<Integer> q = new LinkedList<Integer>();

            //q의 사이즈는 poll 수행시 변경되므로 for문에서 고정조건으로 사용할 시 변수에 사이즈를 따로 담아둔다.
            int num = 0;
            int len = progresses.length;
            for(int i = 0; i <= len; i++) {
                if(i == len) {
                    q.add(num);
                    break;
                }
                if(progresses[i] >= 100) {
                    num++;
                    continue;
                }
                if(num != 0) {
                    q.add(num);
                }

                num = 0;
                int remain = 100 - progresses[i];
                int day = remain / speeds[i]; // 100프로 달성까지 걸리는 일수
                if(remain % speeds[i] != 0) day++;

                for(int j = i; j < len; j++){
                    progresses[j] += (day * speeds[j]);
                }
                num++;
            }
            int[] answer = new int[q.size()];
            for(int i = 0; i < answer.length; i++){
                answer[i] = q.poll();
            }
            return answer;
        }
    }
}