package InflearnLecture.chap07DFSBFS;

//최단거리 알고리즘

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main{

    int []dis = {1,-1,5};
    //ch[] 한 번 방문한 것 Queue에 안 넣겠다는 것이다.
    int[]ch;
    Queue<Integer> Q = new LinkedList<>();
    public int BFS(int S, int E){

        ch = new int[10001];
        ch[S]=1;
        Q.offer(S);
        int L =0;

        while(!Q.isEmpty()){
            //여기 바로 아래 두줄을 생각 못함
            int len = Q.size();
            for(int i=0; i<len; i++){
                int x = Q.poll();
                //여기서 확인해도 되고
                //if(x==e) return L;
                for(int j=0; j<3; j++){
                    int nx = x+dis[j];
                    if(nx==E) return L+1;
                    if(nx>=1 && nx<=10000 && ch[nx]==0){
                        ch[nx]=1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args)throws IOException {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int E = sc.nextInt();

        System.out.println(T.BFS(S, E));
    }
}