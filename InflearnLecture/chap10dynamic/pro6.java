package InflearnLecture.chap10dynamic;

import java.io.IOException;
import java.util.Scanner;

class Main{
    /**
     * 객체 만들지 않아도 된다. 이거 만들어야 하는 경우와 아닌 경우 구분할 줄 알아야
     *
     class problem implements Comparable<problem>{
     int score, time;

     public problem(int score, int time){
     this.score=score;
     this.time=time;
     }

     @Override
     public int compareTo(problem ob){
     return ob.time -this.time;
     }

     }*/
    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        int N =sc.nextInt();
        int M = sc.nextInt();

        int dy[] = new int[M+1];

        for(int i=0; i<N; i++){

            int ps = sc.nextInt();
            int pt = sc.nextInt();
            //j분이 주어졌을 때 얻을 수 있는 최대점수 를 dy[]에 넣어라
            //하나 읽을 때마다 처리함
            //뒤에서 읽어오게 처리해야
            //dy에 시간을 기준으로 점수를 넣어라

            for(int j=M; j>=pt; j--){
                dy[j]= Math.max(dy[j], dy[j-pt]+ps);
            }
        }
        System.out.println(dy[M]);
    }
}
