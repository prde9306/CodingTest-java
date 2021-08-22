package InflearnLecture.chap02Array;

import java.io.IOException;
import java.util.Scanner;

class Main{

    public int solution(int N, int[][]arr){
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;

        for(int i=0; i<N; i++){
            sum1=sum2=0;
            for(int j=0; j<N; j++){
                sum1+=arr[i][j];
                sum2+=arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1=sum2=0;
        for(int i=0; i<N; i++){
            sum1+=arr[i][i];
            sum2+=arr[i][N-i-1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args)throws IOException{

        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [][]arr = new int[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[i][j]= sc.nextInt();
            }
        }

        System.out.print(T.solution(N, arr));

    }
}