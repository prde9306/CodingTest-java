package InflearnLecture.chap08DFSBFSLv2;

import java.io.IOException;
import java.util.Scanner;

class Main{

    static int [] permutation ;
    static int N;
    static int M;
    static int []arr;
    static int []ch;

    public void DFS(int L){
        if(N==L){
            for(int x: permutation)
                System.out.print(x+" ");
            System.out.println();
        }else{
            for(int i=0; i<N; i++){
                if(ch[i]==0){
                    ch[i]=1;
                    permutation[L]=arr[i];
                    DFS(L+1);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args)throws IOException{
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int[]arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i]= sc.nextInt();
        }
        permutation = new int[M];
        ch = new int[N];
        T.DFS(0);
    }
}