package inflearn.chap02Array;

import java.io.IOException;
import java.util.Scanner;

class Main{
    public int solution(int N){
        //소수의 갯수
        int answer =0;
        int[]ch = new int[N+1];

        for(int i=2; i<=N; i++){
            if(ch[i]==0){
                answer++;
                for(int j=i; j<=N; j=j+i){
                    ch[j]=1;
                }
            }
        }
        return answer;
    }

    public static void main(String[]args)throws IOException {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        T.solution(N);
    }
}