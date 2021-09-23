package InflearnLecture.chap09Greedy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
    int time;
    char state;

    public Time(int time, char state){
        this.time=time;
        this.state=state;
    }

    @Override
    public int compareTo(Time ob){
        //이거를 통해서 알파벳 e가 먼저 나오게 끔
        if(this.time ==ob.time) return this.state - ob.state;
        else return this.time - ob.time;
    }
}


class Main{

    public int solution(ArrayList<Time>arr){

        int answer =Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt =0;

        for(Time ob :arr){
            if(ob.state=='s')cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }
        return answer;
    }

    public static void main(String[]args)throws IOException{

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();

        ArrayList<Time> arr = new ArrayList<>();

        for(int i=0; i<N; i++){

            int sT = sc.nextInt();
            int eT = sc.nextInt();
            arr.add(new Time(sT, 's'));
            arr.add(new Time(eT, 'e'));
        }

        System.out.println(T.solution(arr));
    }
}