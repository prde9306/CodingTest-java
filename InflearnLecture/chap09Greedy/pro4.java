package InflearnLecture.chap09Greedy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class lecture implements Comparable<lecture>{

    int revenue, time;

    public lecture(int revenue, int time){
        this.revenue=revenue;
        this.time=time;
    }

    //시간을 기준으로 내림차순
    @Override
    public int compareTo(lecture ob){
        return ob.time - this.time;
    }
}

class Main{

    static int N, max=Integer.MIN_VALUE;
    public int solution(ArrayList<lecture>arr) {

        int answer = 0;

        //가장 큰 값을 우선순위로 꺼냄
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        Collections.sort(arr);

        //여기부터 아래까지 생각 못함
        int j =0;
        //max가 가장 큰 날짜
        for(int i=max; i>=1; i--) {
            for (; j < N; j++) {
                //break어디로 나가는지 헐.. 아직도 continue비교
                if (arr.get(j).time < i) break;
                pq.offer(arr.get(j).revenue);
            }
            //queue에 들어간 값중 가장 큰 값을 꺼낸다.
            if (!pq.isEmpty()) answer += pq.poll();
        }
        return answer;
    }


    public static void main (String[]args)throws IOException{

        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        ArrayList<lecture> arr = new ArrayList<>();

        for(int i=0; i<N; i++){
            int revenue = sc.nextInt();
            int time = sc.nextInt();
            arr.add(new lecture(revenue, time));
            if(time>max) max=time;
        }

        System.out.print(T.solution(arr));
    }
}