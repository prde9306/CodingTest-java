package inflearn.DFSBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
    int x,y;

    Point(int x, int y){
        this.x =x;
        this.y= y;
        }
}

public class Tomato {

    static int [][]tomato, dis;
    static int M, N;
    static int dx[] ={-1, 0, 1, 0};
    static int dy[] ={0, 1, 0, -1};


    public void BFS(int x, int y) {

        Queue<Point> Q = new LinkedList<>();







    }

//며칠이 지나야 다 익는가? 최소일수

//익은, 익지않은, 안 들어있는 경우 3가지

    //모두 익어있으면 0출력, 모두 익지 못하는 상황이면 -1출력
    // 아님 최소일수 출력


    public static void main(String[]args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        //가로
        M = sc.nextInt();
        //세로
        N = sc.nextInt();
        tomato = new int[M+1][N+1];
        dis = new int[M+1][N+1];
        for(int i=1; i<M; i++){
            for(int j=1; j<N; j++){
                tomato[i][j] = sc.nextInt();
            }
        }
        T.BFS(1,1);
        if(tomato[M][N]==);


        }




    }
}