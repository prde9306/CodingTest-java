package InflearnLecture.DFSBFS;

import java.io.IOException;
import java.util.Scanner;

class Main{

    public void DFS(int N){
        if(N==0)return;
        DFS(N/2);
        System.out.print(N%2);
    }

    public static void main(String[] args)throws IOException{
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        T.DFS(N);

    }
}