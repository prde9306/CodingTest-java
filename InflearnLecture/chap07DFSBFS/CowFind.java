package InflearnLecture.chap07DFSBFS;

//최단거리 알고리즘

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CowFind {
    int answer =0;
    int[] dis = {1,-1,5};
    int [] ch;
    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int Level = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                //여기서 이렇게 확인해도 되고 if (x == e) return Level;
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    //nx가 음수로 가지 않게, 방문 여부 0,1로 표시
                    if(nx==e) return Level + 1;
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            Level++;
        }
        return 0;
    }

    public static void main(String[]args){
        CowFind T = new CowFind();
        Scanner sc = new Scanner(System.in);
        int s= sc.nextInt();
        int e = sc.nextInt();
        System.out.println(T.BFS(s,e));
    }

}
