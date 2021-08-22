package InflearnLecture.chap03TwoPointer;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main{
    //이중 포문 돌리지마

    public int solution(int N, int M, int[]arr){

        int[]answer = new int[N-M];

        for(int i=0; i<N-M-1; i++){
            for(int j=0; j<M; j++){
                answer[i]+=arr[j];
            }
        }
        Arrays.sort(answer);
        return answer[N-M-1];
    }

    //windowSliding
    public int solution(int N, int M, int[]arr){
        ins answer =0, sum=0;
        for(int i=0; i<M; i++){
            sum +=arr[i];
        }
        answer = sum;
        for(int i=M; i<N; i++){
            sum +=(arr[i]-arr[i-k]);
            answer=Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[]args)throws IOException {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int []arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(T.solution(N, M, arr));
    }
}