package InflearnLecture.chap08DFSBFSLv2;

//조합은 응용해서 많이 푸니까 그냥암기

import java.util.Scanner;

class Main{
    static int[] combi;
    static int n, m;
    public void DFS(int L, int S){
        if(L==m){
            for(int x : combi) System.out.print(x+" ");
            System.out.println();
        }
        else{
            for(int i=S; i<=n; i++){
                combi[L]=i;

                DFS(L+1, i+1);
            }
        }
    }
    public static void main(String[]args){
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        combi = new int[m];
        T.DFS(0,1);

    }
}