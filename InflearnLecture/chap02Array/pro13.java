package InflearnLecture.chap02Array;

import java.util.Scanner;
import java.io.IOException;

class Main{
    //4중포문을 돌려봐라
    public String solution(int N, int M, int[][]arr){
        int answer =0;
        //4*4경우의 수 에서 조건에 맞는 경우만 뽑기 위해서
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                int cnt =0;
                //하나의 행씩 탐색하면서 맞는지 확인
                for(int k=0; k<M; k++){
                    int pi=0, pj=0;
                    for(int s=0; s<N; s++){
                        if(arr[k][s]==i) pi=s;
                        if(arr[k][s]==j) pj=s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt==M){
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main (String[]args)throws IOException{
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int [][]arr = new int[M][N];

        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print(T.solution(N, M, arr));

    }
}