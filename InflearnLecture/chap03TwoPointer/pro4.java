package InflearnLecture.chap03TwoPointer;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main{
    public int solution(int N, int M, int[]arr){
        int answer=0, sum=0, lt=0;

        /**
         *
         for(int i=0; i<N; i++){
         if(sum > M){
         sum-=arr[lt++];
         }else if(sum<M){
         sum+=arr[i];
         }else{
         answer++;
         }
         }이렇게 풀면 안되는 이유 확실히 알기
         */
        //뒤에꺼를 계속 움직여야 한다.
        for(int rt =0; rt<N; rt++){
            sum +=arr[rt];
            if(sum==M)answer++;

            while (sum>=M){
                sum-=arr[lt++];
                if(sum==M)answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args)throws IOException{
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[]arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print(T.solution(N,M,arr));

    }
}