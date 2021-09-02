package InflearnLecture.chap10dynamic;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


class Main{

    static int N, M;
    static int[]dy;

    public int solution(int[]coin){

        //dy배열 만들고 가장 큰 값으로 초기화
        //dy는 i금액을 만드는데 드는 최소 동전 개수

        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0]=0;
        for(int i=0; i<N; i++){
            for(int j=coin[i]; j<=M; j++){
                // 1원 짜리만 있을 때 거스름돈,
                // 2원  ""
                // 5원 짜리만 있을 때 거스름 돈~~
                dy[j]=Math.min(dy[j], dy[j-coin[i]]+1);
            }
        }
        return dy[M];
    }
    public static void main(String[] args)throws IOException{
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        int []arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i]= sc.nextInt();
        }
        M = sc.nextInt();
        dy = new int[M+1];
        System.out.print(T.solution(N, arr, M));
    }
}