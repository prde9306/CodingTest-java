package InflearnLecture.chap08DFSBFSLv2;

import java.io.IOException;
import java.util.Scanner;

class Main{

    static int M, N;
    static int []pm;

    public void DFS(int L){
        if(L==M){
            for(int x : pm){
                System.out.print(x+" ");
            }
            System.out.println();
        }else{
            for(int i=1; i<=N; i++){

                DFS(L+1);
                pm[L]=i;

            }
        }
    }

    public static void main(String[] args) throws IOException{

        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        pm = new int[M];

        T.DFS(0);
    }
}