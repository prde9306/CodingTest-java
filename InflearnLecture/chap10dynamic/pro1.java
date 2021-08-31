package InflearnLecture.chap10dynamic;

import java.io.IOException;
import java.util.Scanner;

class Main{
    //배열에 넣고 메모이제이션으로 풀어도 된다. -> DFS

    static int[]dy;
    public int solution(int N){
        dy[1]=1;
        dy[2]=2;
        for(i=3; i<=N; i++){
            dy[i]=dy[i-1]+dy[i-2];
        }

        return dy[N];
    }

    public static void main(String[] args)throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        dy = new int[N+1];

        System.out.print(T.solution(N));

    }
}
