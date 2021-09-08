package InflearnLecture.chap07DFSBFS;

import java.util.ArrayList;
import java.util.Scanner;

class Main{

    static int M, N, answer=0;
    //노드의 갯수가 100개 이상으로 많아질 때 인접행렬로 풀면 메모리 낭비, 시간초과난다.
    static ArrayList<ArrayList<Integer>> graph;
    static int [] ch;

    public void DFS(int v){
        if(v==N) answer++;
        else{
            //ArrayList은 인접리스트에서
            //nv : nextvertax
            for(int nv : graph.get(v)){
                if(ch[nv]==0)
                    //채크 먼저하고 들어가야
                    ch[nv]=1;
                    DFS(nv);
                    ch[nv]=0;
            }
        }
    }

    public static void main(String[]args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>;

        //객체생성을 이렇게 꼭해줘야 한다.
        for(int i=0, i<=N; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[N+1];

        for(int i=0; i<N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1]=1;
        T.DFS(1);
        System.out.println(answer);

    }
}