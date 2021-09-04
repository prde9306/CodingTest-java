package InflearnLecture.chap02Array;

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

//밑에는 왜 안되나??? 내방식...

class Main{

    public boolean isPrime(int M){
        boolean answer = false;
        if(M==2||M==3){
            answer=true;
        }
        else{
            if(M%2==0 ||M%3==0) return false;
            else{
                answer =true;
            }
        }
        return answer;
    }

    public int solution(int N){
        int answer =0;
        for(int i=2; i<=N; i++){
            if(isPrime(i)) answer++;
        }
        return answer;
    }


    public static void main(String[] args)throws IOException {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N =sc.nextInt();

        System.out.print(T.solution(N));

    }
}