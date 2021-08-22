package InflearnLecture.chap06;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    //한 사례만 커버가능
    public int solution(int N, int M, int[]arr){
        Queue <Integer> qu = new LinkedList<>();
        int target = arr[M];
        int answer =0;
        for(int i=0; i<N; i++){
            qu.offer(arr[i]);
        }

        for(int i=0; i<N-answer; i++){
            for(int j=i; j<N-answer; j++){
                if(arr[i]>arr[j]) {
                    answer++;
                    if(qu.poll()==target) return  answer;
                    else qu.poll();
                }else{
                    qu.offer(qu.poll());
                }
            }
        }
        return 0;
    }


    public static void main(String[]args)throws IOException {
    //어떻게 반복되게 입력하지???
      //  for문 아니면 while인데
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();
        int []arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }


    }

}
